import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;

public class SimpleFileDownload {

    private static volatile boolean downloadInProgress = true;


    public static void main(String[] args) {
        String fileUrl = "https://masstamilan.com.in/download/hash/73018/0";
        String saveDir = "";

        Thread downloadThread = new Thread(() -> {
            try {
                downloadFile(fileUrl, saveDir);
            } catch (IOException | InterruptedException e) {
                System.err.println("Error downloading file: " + e.getMessage());
            }
        });

        downloadThread.start();

        while (downloadInProgress) {
            try {
                Thread.sleep(1000);
                System.out.println("Download progress: " + getDownloadProgress(fileUrl, saveDir) + "%");
            } catch (InterruptedException e) {
                System.err.println("Download interrupted: " + e.getMessage());
                downloadInProgress = false;
                downloadThread.interrupt();
            }
        }
    }

    private static void downloadFile(String fileUrl, String saveDir) throws IOException, InterruptedException {
        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try (InputStream inputStream = connection.getInputStream(); FileOutputStream outputStream = new FileOutputStream(saveDir + getFileName(fileUrl) + ".mp3")) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytesRead = 0;
            long fileSize = connection.getContentLengthLong();

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                if (Thread.interrupted()) {
                    throw new InterruptedException("Download interrupted");
                }
                outputStream.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
            }

            System.out.println("Download completed.");
            downloadInProgress = false;
        } finally {
            connection.disconnect();
        }
    }

    private static String getFileName(String fileUrl) {
        return fileUrl.substring(fileUrl.lastIndexOf('/') + 1);
    }

    private static int getDownloadProgress(String fileUrl, String saveDir) {
        File file = new File(saveDir + getFileName(fileUrl) + ".mp3");
        if (file.exists()) {
            long fileSize = file.length();
            URL url;
            try {
                url = new URL(fileUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                long totalFileSize = connection.getContentLengthLong();
                connection.disconnect();

                return (int) ((fileSize * 100) / totalFileSize);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}

import java.util.Random;

class Consumer implements Runnable {
    private final int[] buffer;
    private int count;
    private final Object lock;

    public Consumer(int[] buffer, Object lock) {
        this.buffer = buffer;
        this.count = 0;
        this.lock = lock;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            synchronized (lock) {
                try {
                    while (count == 0) {
                        System.out.println("Buffer is empty. Consumer is waiting...");
                        lock.wait();
                    }

                    int item = buffer[count - 1];
                    count--;
                    System.out.println("Consumed: " + item);

                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(random.nextInt(3000)); // Sleep for up to 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

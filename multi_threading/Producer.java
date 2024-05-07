import java.util.Random;

class Producer implements Runnable {
    private final int[] buffer;
    private int count;
    private final Object lock;

    public Producer(int[] buffer, Object lock) {
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
                    while (count == buffer.length) {
                        System.out.println("Buffer is full. Producer is waiting...");
                        lock.wait();
                    }

                    int item = random.nextInt(100);
                    buffer[count] = item;
                    count++;
                    System.out.println("Produced: " + item);

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

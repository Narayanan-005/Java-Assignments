public class Main {
    public static void main(String[] args) {
        int[] buffer = new int[10];
        Object lock = new Object();

        Producer producer = new Producer(buffer, lock);
        Consumer consumer = new Consumer(buffer, lock);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

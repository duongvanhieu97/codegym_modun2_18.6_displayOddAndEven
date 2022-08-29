public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread threadEven = new Thread(evenThread);
        Thread threadOdd = new Thread(oddThread);
        evenThread.setName("EvenThread");
        oddThread.setName("OddThread");
        threadEven.start();
//        Join nó làm cho các threadEven chạy hết rồi mới chạy sang threadOdd
        threadEven.join();
        threadOdd.start();
    }
}

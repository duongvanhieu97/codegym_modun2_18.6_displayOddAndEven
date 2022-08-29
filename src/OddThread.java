public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                if (i % 2 != 0) {
                    System.out.println(this.getName() + "Odd" + i);
                }
                Thread.sleep(200);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package Threads;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println("2--------" + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            System.out.println("Error sleep");
            return;
        }


        System.out.println("Thread sleep 3000miles ");
    }

}

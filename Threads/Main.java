package Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("Another thread");
        anotherThread.start();
        new Thread(){
            @Override
            public void run() {
                System.out.println("2.5-----");
//                try{
//                    Thread.sleep(4000);
//                }catch (InterruptedException e){
//                    System.out.println("Sleep continue error----");
//                }
//                System.out.println("Sleep continue 4000");
                try {
                    anotherThread.join(2000);
                    System.out.println("Ngon lanh canh dao");
                }catch (InterruptedException e){
                    System.out.println("Error can't wait");
                }

            }

        }.start();

        Thread myThread = new Thread(new MyThread());
        myThread.start();
//        anotherThread.interrupt();

        System.out.println("3");
    }
}

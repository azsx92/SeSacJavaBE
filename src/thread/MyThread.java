package thread;

public class MyThread extends Thread{
    public MyThread() {
        System.out.println("thread start");
    }
    @Override
    public void run(){
//        쓰레드 작업내용
        //damon
        System.out.println(getName() + ":" + (isDaemon() ? "데몬쓰레드" : "일반쓰레드"));
        for (int i = 0; i < 6; i++) { System.out.println(getName() + ":" + i + "초");
            try {Thread.sleep(1000);}
            catch (InterruptedException e) {}
        }

        // #약간의 시간 지연
//        for (long i = 0; i < 100000000; i++) { }
//        System.out.println(getName() + "우선 순위: " + getPriority());




//        Thread myThread = new MyThread();
//     또는   MyThread myThread = new MyThread();
//        myThread.start();

    }
}

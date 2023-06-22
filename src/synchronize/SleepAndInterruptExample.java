package synchronize;

import thread.MyThread;

public class SleepAndInterruptExample {
    public SleepAndInterruptExample() throws InterruptedException {
        MyThread myThread = new MyThread(); myThread.start();
        //#Thread.sleep()
        Thread.sleep(100); //run()이 시작되기까지 시간여유
        System.out.println("MyThread State : " + myThread.getState()); //TIMED_WAITING
        //#interrupt()
        myThread.interrupt();
        Thread.sleep(100); //예외발생까지의 시간여유
        System.out.println("MyThread State : " + myThread.getState()); //RUNNABLE
    }
}

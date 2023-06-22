package synchronize;

public class MyData {
    int data =3;
// ☞ 동기화(synchronized) 방법
//
//    방법#1 - 메서드 동기화 (synchronized method) <- 동시에 두 개의 Thread가 동기화 메서드 사용불가
//    방법#2 - 블록 동기화 (synchronized block) <- 동시에 두 개의 Thread가 동기화 블록 사용불가
    public  void plusData(){
        synchronized (this) { // Key를 가진 객체 (모든 객체는 저마다의 Key 하나를 가지고 있음) 일반적으로 클래스 내부에서 바로 사용할 수 있는 객체인 this를 사용
            // 데이터를 바로 가져와 2초 뒤 결과값 저장
            int mydata = data;
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {   }
                data = mydata+1;
        }
    }

    public void test () {
            //#공유객체
            MyData myData = new MyData();
            //#plusThread1
            Thread plusThread1 = new PlusThread(myData);
            plusThread1.setName("plusThread1");
            plusThread1.start();

            try { Thread.sleep(1000); }
            catch (InterruptedException e) {}
            //#plusThread2
            Thread plusThread2 = new PlusThread(myData);
            plusThread2.setName("plusThread2");
            plusThread2.start();

    }
}

package synchronize;

public class MyData {
    int data =3;

    public void plusData(){
        // 데이터를 바로 가져와 2초 뒤 결과값 저장
        int mydata = data;
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {   }
            data = mydata+1;
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

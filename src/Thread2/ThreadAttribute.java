
package Thread2;
public class ThreadAttribute {
    public ThreadAttribute() {
        //#1. 객체 가져오기 + 쓰레드 수
        Thread curThrad = Thread.currentThread();
        System.out.println("현재 쓰래드 이름:" + curThrad.getName());
        System.out.println("쓰래드 수:" + Thread.activeCount());

        //#2. 쓰레드 이름 자동 설정
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
        }

        //#3. 쓰레드 이름 직접 설정
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread();
            thread.setName(i+"번째 쓰레드");
            System.out.println(thread.getName());
            thread.start();
        }

        //#4. 쓰레드 이름 자동 설정
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
        }

        //#5. 쓰레드 수
        System.out.println("쓰래드 수:" + Thread.activeCount());
    }
}

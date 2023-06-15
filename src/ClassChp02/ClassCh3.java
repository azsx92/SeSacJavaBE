package ClassChp02;

public class ClassCh3 extends ClassCh2{
    /*
    *  상속의 개념
    * -부모클래스의 멤버(필드, 메서드, 이너클래스)를 자식 클래스가 내려바아(상속) 클래스 내부에 포함
    * Tip
    * - 상속 다이어프램을 표기할 때 부모 클래스 쪽으로 화살표가 있음
    * - UML(Unified Modeling language)
    * - 시스템을 모델로 표현해주는 대표적인 모델링 언어
    * */

    interface C {
        public abstract void bcd();
    }
    C c = new C() {
        @Override
        public void bcd() {

        }
    };
    public void print() {
        super.print();
        System.out.println("B 클래스 print1");
    }
    public void print2(int a) {
        System.out.println("B 클래스 print2");
    }
}

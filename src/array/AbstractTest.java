package array;

import java.util.ArrayList;
import java.util.List;

public class AbstractTest {
    public static void main(String[] args) {
        Parent child = new Child();
        child.print();
    }


    public static abstract class Parent {
        public void print() {
            System.out.println("Parent");
        }

        public abstract void print2();

    }

    public static class Child extends Parent {
        @Override
        public void print() {
            super.print();
            System.out.println("Child");
        }

        @Override
        public void print2() {

        }
    }
}

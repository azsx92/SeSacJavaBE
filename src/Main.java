import ClassChp01.AA;
import ClassChp02.ClassCh2;
import ClassChp02.ClassCh3;
import StringMethod.StringChp01;
import StringMethod.StringChp02;
import array.ArrayTest;
import array.ArrayTest2;
import array.SecondArrayTest3;
import array.SecondArrayTest4;
import exam01.A;
import mypack.Test;
import mypack.sesac.Test02;
import thread.MyThread;
import thread.SMIFileThread;
import thread.Thread01;

public class Main  {
        public static void main ( String[] args) {
//            연산자 산술 연산자 (+ , - , *, /, %)
/*
            System.out.println(2+3); //5
            System.out.println(8-5); //3
            System.out.println(7*2); //14
            System.out.println(7/2); //3
            System.out.println(8%5); //3
            System.out.println("--------------------");
            int a=3;
            ++a;
            System.out.println(a);

            int b=3;
            b++;
            System.out.println(b);

            System.out.println("--------------------");
            // 전위형
             a = 3;
             b =++a;
            System.out.println(a);  // 4
            System.out.println(b);  // 4
            System.out.println("--------------------");
            // 후위형
             a =3;
             b = a++;
            System.out.println(a);  //4
            System.out.println(b);  //3

            System.out.println("--------------------");
//          연장자의 종류 - 비트연산자- (&, | , ~ , ^)
            // 비트 AND 연산자
            System.out.println(3 & 10);

            a = (3 > 5) ? 6 : 9;
            b = (5 > 3) ? 10 : 20;
            System.out.println(a);
            System.out.println(b);


            System.out.println("--------------------");
            if (3 > 5) {
                System.out.println(12);
                System.out.println(13);
            }

            if (3 > 5)
                System.out.println(12);
                System.out.println(13);
            System.out.println();

            a = 85;
            if (a>=70) {
                System.out.println("c학점");
            } else if (a>=80) {
                System.out.println("b학점");
            } else if (a>=90) {
                System.out.println("a학점");
            } else {
                System.out.println("F학점");
            }

            System.out.println();
            if (a>=90) {
                System.out.println("a학점");
            } else if (a>=80) {
                System.out.println("b학점");
            } else if (a>=70) {
                System.out.println("c학점");
            } else {
                System.out.println("F학점");
            }
*/

//            for

/*
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
            System.out.println("---------------------");
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
            System.out.println("---------------------");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println("---------------------");
            for (int i = 0; i > 10; i+=2) {
                System.out.println(i);
            }
            System.out.println("---------------------");
            for (int i = 0,j = 0; i < 10; i++, j++) {
                System.out.println(i);
            }
*/
/*

            System.out.println("3단씩 조언을 구하기");
            System.out.println("*******************************");
            for (int i = 1; i < 10; i=i+3) {
                for (int j = 1; j < 10; j++) {
                    for (int k = i; k <i+3; k++) {
//                        System.out.println("i = " + i + " j = " + j + " k = " + k);
                        System.out.print(k+"*"+j+ "="+j*k+ "\t");
                    }
                    System.out.println();
                }
            System.out.println("*******************************");
            }

            // 1*1=1   2*1=2  3*1=3
            // 1*2=2   2*2=4  3*2=6
            // 1*3=3   2*3=6  3*3=9
            // 1*9=9   2*9=18 3*9=27
            // *****************************
            // 4*1=4   5*1=5  6*1=6


            for (int i = 2; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.print(i +" * " + j +" = "+ i*j+"\t");
                }
                System.out.println();
            }
*/

//            ArrayTest a = new ArrayTest();
//            ArrayTest2 b = new ArrayTest2();
//            SecondArrayTest3 c = new SecondArrayTest3();
//            SecondArrayTest4 c2 = new SecondArrayTest4();
//            StringChp01 s = new StringChp01();
//            StringChp02 s2 = new StringChp02();
//            AA a = new AA();
/*
            //#1 A 타입 선언 A 객체 생성
            ClassCh2 aa = new ClassCh2();
            aa.print(); //A class
            aa.print2(); //A class print2
            //#2 B 타입 선언 B 객체 생성
            ClassCh3 bb = new ClassCh3();
            bb.print(); //B클래스
            bb.print2(); // A 클래스 print2
            bb.print2(3);  //B 클래스 print2
            //#3 A 타입 선언 B 객체 생성(다형성 표현)
            ClassCh2 ab = new ClassCh3();
            ab.print(); //B클래스
            ab.print2(); //B클래스*/
//            ab.print2(3); //오류

            // 메서드 오버라이딩
//            ClassCh2 , ClassCh3 print
            //메서드 오버로딩
//            ClassCh2 , ClassCh3 print2

//            2023.06.19 월
//            Thread01 thread01 = new Thread01();
//            MyThread myThread = new MyThread();
//            myThread.run();
            //SMIFileThread 생성 및 실행
            Thread smiFileThread = new SMIFileThread();
            smiFileThread.start();

            //(비디오프레임번호) 1~5 저장 + 출력
            int[] intArray = new int[]{1,2,3,4,5};

            for (int i = 0; i < intArray.length; i++) {
                System.out.print("(비디오 프레임)" + intArray[i]);
                try{Thread.sleep(200); } catch (InterruptedException e ){};

            }
        }
}
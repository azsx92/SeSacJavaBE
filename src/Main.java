import mypack.Test;
import mypack.sesac.Test02;

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
        }
}
import mypack.Test;
import mypack.sesac.Test02;

public class Main  {
        public static void main ( String[] args) {
//            연산자
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

            System.out.print("hello_java");
        }

}
package StringMethod;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class StringChp02 {
    public StringChp02() {
//        length
        String str1 = "Hello Java";
        String str2 ="안녕하세요! 반갑습니다.";

        System.out.println(str2.length()); //11
        System.out.println(str2.length()); //13
        System.out.println();

//        문자열 검색(charAt(.),indexOf(.), lastIndexOf(.))
//        chatAt(.)
        System.out.println(str1.charAt(1));  //e
        System.out.println(str1.charAt(1));  //녕
        System.out.println();

//        indexOf(.), lastindexOf(.)
        System.out.println(str1.indexOf('a',8));
        System.out.println(str1.lastIndexOf('a',8));

        System.out.println(str1.indexOf("java"));
        System.out.println(str1.lastIndexOf("java"));

        System.out.println(str2.indexOf("java"));
        System.out.println(str2.lastIndexOf("java"));

        System.out.println(str1.indexOf("Bye"));
        System.out.println(str2.indexOf("고맙습니다."));
        System.out.println();

//        String.valueOf
        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);
//      concat()
        String str5 = str3.concat(str4);
        System.out.println(str5);
//        String.valueOf() + concat() = + Operation
        String str6 = "안녕" +3;
        String str7 = "안녕".concat(String.valueOf(3));

        System.out.println(str6); //안녕3
        System.out.println(str7); //안녕3

//        getBytes(), toCharArray()
        String str8 = "Hello.Java";
        String str9 ="안녕하세요.";

        byte[] array1 = str8.getBytes();
        System.out.println(Arrays.toString(array1));

        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array2));

        char[] array3 = str8.toCharArray();
        System.out.println(array3);

        char[] array4 = str9.toCharArray();
        System.out.println(array4);

//        @toLowerCase(), toUpperCase()
        str1 = " Java_Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //@replace(.,.)
        System.out.println(str1.replace("Study","공부")); //java 공부

        //@substring(.)
        System.out.println(str1.substring(0,5));

        //@split(.)
        String[] strArray = "abc/def-ghi jkl".split("/|-|");
        System.out.println(Arrays.toString(strArray));

//        @trim
        System.out.println(" abc ".trim()); //abc
        System.out.println();

        str2 = new String("Java");
        str3 = new String("Java");
        str4 = new String("Java");

        //@ == 메모리번지 비교(stack 메모리 값 비교)
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2 == str4);
        System.out.println();

//        @equals(.).equalslgnoreCase(.) 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));






    }

}

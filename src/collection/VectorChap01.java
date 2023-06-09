package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorChap01 {
    public VectorChap01() {
//        ☞ Vector<E>
//        - 데이터추가
        List<Integer> vector1 = new Vector<Integer>();
//#1. add(E element)
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1.toString()); //[3, 4, 5]

//#2. add(int index, E element)
        vector1.add(1, 6);
        System.out.println(vector1.toString()); //[3, 6, 4, 5]

        //#3. addAll(Collection<? extends E> c)
        List<Integer> vector2 = new Vector<Integer>();
        vector2.add(1);
        vector2.add(2);
        vector2.addAll(vector1);
        System.out.println(vector2.toString()); //[1,2,3,6,4,5]
//#4. addAll(int index, Collection<? extends E> c)
        List<Integer> vector3 = new Vector<Integer>();
        vector3.add(1);
        vector3.add(2);
        vector3.addAll(1, vector3);
        System.out.println(vector3.toString()); //[1,1,2,2]

//        ☞ Vector<E>
//        - 데이터변경
//#5. set(int index, E element)
        vector3.set(1, 5);
        vector3.set(3, 6);
        //vector3.set(4, 7); //IndexOutOfBoundsException
        System.out.println(vector3.toString()); //[1,5,2,6]

//        data remove

//#6. remove(int index)
        vector3.remove(1);
        System.out.println(vector3.toString()); //[1,2,6]
//#7. remove(Object o)
        vector3.remove(new Integer(2));
        System.out.println(vector3.toString()); //[1,6]
//#8. clear()
        vector3.clear();
        System.out.println(vector3.toString()); //[]

//        ☞ Vector<E>
//        - 데이터 정보 추출

//#9. isEmpty();
        System.out.println(vector3.isEmpty()); //true
//#10. size()
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        System.out.println(vector3.toString()); //[1,2,3]
        System.out.println("size : " + vector3.size()); //size : 3
//#11. get(int index)
        System.out.println("0번째 : " + vector3.get(0)); //0번째 : 1
        System.out.println("1번째 : " + vector3.get(1)); //1번째 : 2
        System.out.println("2번째 : " + vector3.get(2)); //2번째 : 3
        for (int i = 0; i < vector3.size(); i++) {
            System.out.println(i + "번째 : " + vector3.get(i));
        }

//        ☞ Vector<E>
//        - 리스트 배열

//#12. toArray()
        Object[] object = vector3.toArray();
        System.out.println(Arrays.toString(object)); //[1,2,3]
//#13-1. toArray(T[] t)
        Integer[] integer = vector3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer)); //[1,2,3]
//#13-2. toArray(T[] t)
        integer = vector3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer)); //[1,2,3,null,null]
    }
}

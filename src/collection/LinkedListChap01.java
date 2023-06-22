package collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListChap01 {
    public LinkedListChap01() {
//        ☞ LinkedList<E>
//        - 데이터추가
        List<Integer> linkedList1 = new LinkedList<Integer>();
//#1. add(E element)
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        System.out.println(linkedList1.toString()); //[3, 4, 5]

//#2. add(int index, E element)
        linkedList1.add(1, 6);
        System.out.println(linkedList1.toString()); //[3, 6, 4, 5]

//#3. addAll(Collection<? extends E> c)
        List<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.addAll(linkedList1);
        System.out.println(linkedList2.toString()); //[1,2,3,6,4,5]

//#4. addAll(int index, Collection<? extends E> c)
        List<Integer> linkedList3 = new LinkedList<Integer>();
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.addAll(1, linkedList3);
        System.out.println(linkedList3.toString()); //[1,1,2,2]

//        ☞ LinkedList<E>
//        - 데이터변경

//#5. set(int index, E element)
        linkedList3.set(1, 5);
        linkedList3.set(3, 6);
// linkedList3.set(4, 7); //IndexOutOfBoundsException
        System.out.println(linkedList3.toString()); //[1,5,2,6]
//        - 데이터삭제

//#5. set(int index, E element)
        linkedList3.set(1, 5);
        linkedList3.set(3, 6);
// linkedList3.set(4, 7); //IndexOutOfBoundsException System.out.println(linkedList3.toString()); //[1,5,2,6]
//#6. remove(int index)
        linkedList3.remove(1);
        System.out.println(linkedList3.toString()); //[1,2,6]
//#7. remove(Object o)
        linkedList3.remove(new Integer(2));
        System.out.println(linkedList3.toString()); //[1,6]
//#8. clear()
        linkedList3.clear();
        System.out.println(linkedList3.toString()); //[]

//        ☞ LinkedList<E>
//        - 데이터 정보 추출

//#9. isEmpty();
        System.out.println(linkedList3.isEmpty()); //true
//#10. size()
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.add(3);
        System.out.println(linkedList3.toString()); //[1,2,3]
        System.out.println("size : " + linkedList3.size()); //size : 3
//#11. get(int index)
        System.out.println("0번째 : " + linkedList3.get(0)); //0번째 : 1
        System.out.println("1번째 : " + linkedList3.get(1)); //1번째 : 2
        System.out.println("2번째 : " + linkedList3.get(2)); //2번째 : 3
        for (int i = 0; i < linkedList3.size(); i++) {
            System.out.println(i + "번째 : " + linkedList3.get(i));
        }
//        ☞ LinkedList<E>
//        - 리스트 배열

//#12. toArray()
        Object[] object = linkedList3.toArray();
        System.out.println(Arrays.toString(object)); //[1,2,3]
//#13-1. toArray(T[] t)
        Integer[] integer = linkedList3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer)); //[1,2,3]
//#13-2. toArray(T[] t)
        integer = linkedList3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer)); //[1,2,3]
    }
}

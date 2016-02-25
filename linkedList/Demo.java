package linkedList;


import java.util.Collections;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args)  {
        SimpleLinkedList list = new SimpleLinkedList();

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        Integer i3 = new Integer(3);
        Integer i4 = new Integer(4);
        Integer i5 = new Integer(5);
        Integer i6 = new Integer(6);

        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s5 = "e";
        String s6 = "g";



        list.addFirst(s1);
        list.addFirst(s2);
        list.addLast(s4);
        list.addLast(s5);

        list.addAfter(s1, s4);

        list.addFirst(s3);
        list.addAfter(s5,s5);





//             int i = list.getSize();
//        for (Iterator<Object> it = list.iterator(); i >=0; i-- ) {
//            if (it.hasNext()==false) {
//            it.remove();
//            break;}
//            it.next();
//        }
        for (Object o : list) {
//            String s = (String)o;
            System.out.println(o);
        }
    }
//    Collections.sort
}

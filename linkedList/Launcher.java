package linkedList;


import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
//        List<String> myList = new ArrayList<>();
        List<String> lList = new LinkedList<>();

        lList.add("Java");
        lList.add("C++");
        lList.add("Phyton");
        lList.add("few");
        lList.add("knowledge");
        lList.add("success");
        lList.add("Tiger");
        lList.add("Alex");
        lList.add("lesson");
        lList.add("money");
        lList.set(9, "bullet");
        lList.get(1);

        ListIterator iter = lList.listIterator();
        iter.next();
        iter.add("vip customer");
        iter.previous();
        iter.previous();
        iter.previous();
//        iter.remove();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }



//        Enumeration enumer = Collections.enumeration(lList);
//        while (enumer.hasMoreElements()) {
//            String list = (String) enumer.nextElement();
//            System.out.println(list);
//        }
//
//       Collections.sort(lList, myComparator);
//        while (enumer.hasMoreElements()) {
//            String list = (String) enumer.nextElement();
//            System.out.println(list);
//        }
//
//                int value  =  o1.compareToIgnoreCase(o2);
//                if (value>0) {
//                    return -1;
//                } else if (value<0 ) {
//                    return 1;
//                }else {
//                    return 0;
//                }
//
//            }
//        });
////        Collections.shuffle(myList);
//        Collections.swap(myList, 1, 3);
//        Collections.rotate(myList,4);
////        Collections.fill(myList, "hash");
//        Collections.replaceAll(myList, "lesson", "magazine");
//        for (String s : myList) {
//            System.out.println(s);
//        }
//
    }
}

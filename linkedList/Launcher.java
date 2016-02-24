package linkedList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
//        MyComparator myComparator = new MyComparator();
        List<String> myList = new ArrayList<>();

        myList.add("Java");
        myList.add("C++");
        myList.add("Phyton");
        myList.add("few");
        myList.add("knowledge");
        myList.add("success");
        myList.add("Tiger");
        myList.add("Alex");
        myList.add("lesson");
        myList.add("money");

        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int value  =  o1.compareToIgnoreCase(o2);
                if (value>0) {
                    return -1;
                } else if (value<0 ) {
                    return 1;
                }else {
                    return 0;
                }

            }
        });
        for (String s : myList) {
            System.out.println(s);
        }
    }
}

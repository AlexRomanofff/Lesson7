package linkedList;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {


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

}

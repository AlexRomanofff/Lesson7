package Lesson7Task5;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        SimpleArrayList salist = new SimpleArrayList();
        salist.add("mama");
        salist.add("papa");
        salist.add("grandpa");
        salist.add("brother");
        salist.add("sister");
        salist.add("grandma");
        System.out.println(salist.size());

        Iterator it = salist.iterator();
        it.next();
        it.remove();
        it.next();
        it.next();
        it.next();
        it.remove();

        for (Object o:salist) {
            String s = (String) o;
            System.out.println(s);
        }
    }
}

package lesson11.simpleList;



public class Demo {
    public static void main(String[] args) {
        SimpleList simpleList = new SimpleList();
        simpleList.add("s6");
//        simpleList.add("s2");
//        simpleList.remove("s1");
//        simpleList.add("s4");
//        simpleList.add("s3");
//        simpleList.add("s5");
//        simpleList.remove("s5");

        for(Object o:simpleList) {
            System.out.println(o);
        }

        System.out.println(simpleList.getSize());
    }
}

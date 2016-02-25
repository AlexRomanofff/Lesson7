package lesson7;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person ();
        Person p2 = new Person();
        Person p3 = new Person();
        Adress a1 = new Adress();
        Adress a2 = new Adress();
        Adress a3 = new Adress();

//        HashMap<String, Person> personMap = new HashMap<String, Person>();
//        personMap.put(p1.getName(),p1);
//        personMap.put(p2.getName(),p2);

        p1.setName("Alex");
        p1.setAge(34);
        p1.setSalary(50000);

        a1.setCity("Obukhiv");
        a1.setStreet("Kyivskaya");
        a1.setHouse(45);

        p1.setAdress(a1);

        p2.setName("Alex");
        p2.setAge(34);
        p2.setSalary(50000);

        a2.setCity("Obukhiv");
        a2.setStreet("Kyivskaya");
        a2.setHouse(45);

        p2.setAdress(a2);

        p3.setName("Nadya");
        p3.setAge(32);
        p3.setSalary(12000);

        a1.setCity("Obukhiv");
        a1.setStreet("Kyivskaya");
        a1.setHouse(45);
        p3.setAdress(a1);

        HashMap<String, Person> personMap = new HashMap<>();
        personMap.put(p1.getName(),p1);
        personMap.put(p2.getName(),p2);
        personMap.put(p3.getName(),p3);

//        for(String key: personMap.keySet()) {
//            System.out.println( key);
//        }
//
//        for (Person p : personMap.values()) {
//            System.out.println( "name: "+p.getName() + " Age " + p.getAge() + " years Salary "+ p.getSalary());
//        }
//
//        for(String key: personMap.keySet()) {
//            Person value = personMap.get(key);
//            System.out.println( "name: "+value.getName() + " Age " + value.getAge() + " years Salary "+ value.getSalary());
//        }

        System.out.println(personMap.size());
        System.out.println(personMap.isEmpty());
        System.out.println(personMap.containsKey("Alex"));
        System.out.println(personMap.containsValue(p2));
        personMap.remove("Nady");
        System.out.println(personMap.size());
        personMap.clear();
        System.out.println(personMap.isEmpty());
        personMap.get(p1.getName());

//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals(p3));
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p3.hashCode());


    }
}

package lesson7;

public class Person {
   private int age;
   private String name;
   private long salary;
   private Adress adress;

    public Person () {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person per = (Person) obj;
            if (getName() != null && getAdress() != null && getAge() > 0 && getSalary() > 0) {

                return (getName().equals(per.getName()) && getAge() == per.getAge() && getSalary() == per.getSalary()
                && getAdress().equals(per.getAdress()));
            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 24;
        result = 37*result+getName().hashCode();
        result = 37*result+getAge();
        result = 37*result+new Long (getSalary()).hashCode();
        return 37*result + getAdress().hashCode();

    }
}


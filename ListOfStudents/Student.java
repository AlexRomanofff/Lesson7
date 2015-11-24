package ListOfStudents;

/**
 * Created by Алекс on 23.11.2015.
 */
public class Student {
    private String name;
    private String secondName;
    public Student () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return (getName()+" "+getSecondName());
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student) {
//            Student student = (Student) obj;
//            return (name != null && secondName != null && name.equals(student.getName()) && secondName.equals(student.getSecondName()));
//        }
//        return false;
//    }
}

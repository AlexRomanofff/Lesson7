package ListOfStudents;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    List <Student> students = new ArrayList<>();

    public ClassRoom () {

    }


    public void enterClass (Student student) {
        students.add(student);
    }

    public void leaveClass (Student student) {
        students.remove(student);
    }
    public void printList () {
        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i).getName()+" "+students.get(i).getSecondName());
        }
        System.out.println();
    }
    public int getStudentCount () {
        return students.size();
    }
    public boolean isPresent (String name, String secondName) {
        for (Student student: students) {
            if (student.getName()==name && student.getSecondName() == secondName) {
                System.out.printf("%s %s %s %s%n", "Student",name ,secondName,"is present");
                return true;

            }
        }
        System.out.printf("%s %s %s %s%n", "Student",name ,secondName,"is absent");
        return false;
    }

    public List<Student> getStudents() {
        return students;
    }
}

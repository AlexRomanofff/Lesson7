package ListOfStudents;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    List <Student> students;

    public ClassRoom () {
     students = new ArrayList<>();
    }


    public void enterClass (Student student) {
        students.add(student);
    }

    public void leaveClass (Student student) {
        students.remove(student);
    }
    public void printList () {

        System.out.println(students);
        System.out.println();
    }
    public int getStudentCount () {
        return students.size();
    }

    public boolean isPresent(Student stud) {
        for (Student student : students) {
            if (students.contains(stud)) {
                System.out.printf("%s %s %s %s%n", "Student", student.getName(), student.getSecondName(), "is present");
                return true;
            }
        }
        System.out.printf("%s %s %s %s%n", "Student", stud.getName(), stud.getSecondName(), "is absent");
        return false;
    }

    public List<Student> getStudents() {
        return  new ArrayList<>(students);
    }
}

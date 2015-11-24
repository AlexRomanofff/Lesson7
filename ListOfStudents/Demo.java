package ListOfStudents;

/**
 * Created by Алекс on 23.11.2015.
 */
public class Demo {
    public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom();

        Student student = new Student();
        student.setName("Alex");
        student.setSecondName("Romanov");
        classRoom.enterClass(student);

        Student student1 = new Student();
        student1.setName("Mary");
        student1.setSecondName("Stewart");
        classRoom.enterClass(student1);

        Student student2 = new Student();
        student2.setName("Andrew");
        student2.setSecondName("Henly");
        classRoom.enterClass(student2);

        Student student3 = new Student();
        student3.setName("Sarah");
        student3.setSecondName("Connor");
        classRoom.enterClass(student3);

        Student student4 = new Student();
        student4.setName("Alfred");
        student4.setSecondName("Hichcock");
        classRoom.enterClass(student4);

        Student student5 = new Student();
        student5.setName("Maria");
        student5.setSecondName("Ho");
        classRoom.enterClass(student5);

        classRoom.printList();
        classRoom.leaveClass(student);
        classRoom.leaveClass(student2);
        System.out.println(classRoom.getStudentCount());
        classRoom.printList();
        classRoom.isPresent("Maria", "Ho");
        classRoom.isPresent("Alex", "Romanov");
    }

}

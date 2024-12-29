import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        School school = new School();

        Scanner scanner = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\untitled1\\out\\Students"));

        while (scanner.hasNextLine()) {
            Student student = new Student();

            student.setName(scanner.next());
            student.setSurname(scanner.next());
            student.setAge(Integer.parseInt(scanner.next()));
            student.setGender(scanner.next() == "Male");

            while (scanner.hasNextInt()) {
                student.addGrade(scanner.nextInt());
            }

            school.addMember(student);
        }

        Scanner scannerTeachers = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\untitled1\\out\\teachers"));
        while (scannerTeachers.hasNextLine()) {
            Teacher teacher = new Teacher();

            teacher.setName(scannerTeachers.next());
            teacher.setSurname(scannerTeachers.next());
            teacher.setAge(Integer.parseInt(scannerTeachers.next()));
            String genderStr = scannerTeachers.next();
            teacher.setGender(genderStr.equalsIgnoreCase("Male"));


            teacher.setSubject(scannerTeachers.next());
            teacher.setYearsOfExperience(Integer.parseInt(scannerTeachers.next()));
            teacher.setSalary(Integer.parseInt(scannerTeachers.next()));
            school.addMember(teacher);
        }
        System.out.println(school);

        for (Person p : school.getMembers()) {
            if (p instanceof Student) {
                Student s = (Student) p;
                System.out.println(s.getSurname() + " (ID=" + s.id + ") GPA: " + s.calculateGPA());
            }
        }
        for (Person p : school.getMembers()) {
            if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                if (t.yearsOfExperience > 10) {
                    System.out.println("Before raise: " + t.getSurname() + ", salary = " + t.salary);
                    t.giveRaise(10);
                    System.out.println("After raise: " + t.getSurname() + ", salary = " + t.salary);
                }
            }
        }
        System.out.println(school);
    }
}

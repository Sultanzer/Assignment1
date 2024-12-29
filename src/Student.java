import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    List<Integer> grades = new ArrayList<>();

    public Student() {
        super();
    }

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);

        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.size() == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.size();
    }

    @Override

    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + "I am student with ID" + getId() + ".";
    }
}
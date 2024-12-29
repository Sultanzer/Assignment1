public class Teacher extends Person {

    String subject;
    int yearsOfExperience;
    int salary;

    public Teacher() {
        super();
    }

    public Teacher(String name, String surname, int age, boolean gender,
                   String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getSubject() {
        return subject;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public int getSalary() {
        return salary;
    }


public void giveRaise(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100.0);
        }
    }

@Override

    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + " I teach " + subject + ".";
    }
}
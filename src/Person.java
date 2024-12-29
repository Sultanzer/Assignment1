public class Person {
    private static int nextId = 1;
    int id;

    private String name;
    private String surname;
    private int age;
    private boolean gender; // true = Male, false = Female

    public Person() {
        this.id = nextId;
        nextId++;
    }

    public Person(String name, String surname, int age, boolean gender) {
        this();

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + ".";
    }
}

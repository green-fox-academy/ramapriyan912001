import java.util.HashMap;

public class Person {
    private int age;
    private String name;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public String introduceHelper() {
        return String.format("Hi, I'm %s, a %d year old gender %s", name, age, gender);
    }
    public void introduce() {
        System.out.println(introduceHelper() + ".");
    }

    public String getGoalHelper() {
        return "My goal is:";
    }
    public void getGoal() {
        System.out.println(getGoalHelper() + " Live for the moment!");
    }


}

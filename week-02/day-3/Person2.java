public class Person2 implements Cloneable {
    protected int age;
    protected String name;
    protected String gender;

    public Person2(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person2() {
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


    @Override
    public Person2 clone() {
        return new Person2(this.name, this.age, this.gender);
    }
}

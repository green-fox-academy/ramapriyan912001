public class Mentor extends Person{
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    @Override
    public void introduce() {
        System.out.println(introduceHelper() + String.format(" %s mentor", level));
    }

    @Override
    public void getGoal() {
        System.out.println(getGoalHelper() + String.format(" Educate brilliant junior software developers."));
    }


}

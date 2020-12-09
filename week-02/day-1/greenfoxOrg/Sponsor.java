public class Sponsor extends Person2 {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void hire() {
        this.hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println(super.getGoalHelper() + String.format(" Hire brilliant junior software developers."));
    }

    @Override
    public void introduce() {
        System.out.println(super.introduceHelper() + String.format(" who represents %s and hired %d students so far.",
                company, hiredStudents));
    }
}

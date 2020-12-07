public class Student extends Person{

    private String previousOrganisation;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganisation = "The School Of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal(){
        System.out.println(getGoalHelper() + " Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println(introduceHelper() + String.format
                (" from %s who skipped %d days from the course already.", previousOrganisation, skippedDays));
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }




}

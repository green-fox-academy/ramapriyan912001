public class Student2 extends Person2 {

    private String previousOrganisation;
    private int skippedDays;

    public Student2(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }

    private Student2(String name, int age, String gender, String previousOrganisation, int skippedDays) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = skippedDays;
    }

    public Student2() {
        super();
        this.previousOrganisation = "The School Of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal(){
        System.out.println(super.getGoalHelper() + " Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println(super.introduceHelper() + String.format
                (" from %s who skipped %d days from the course already.", previousOrganisation, skippedDays));
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }


    @Override
    public Student2 clone() {
        return new Student2(this.name, this.age, this.gender, this.previousOrganisation, this.skippedDays);
    }

    public static void main(String[] args) {
        Student2 john = new Student2("John", 20, "male", "BME");
        Student2 johnTheClone = john.clone();
    }
}

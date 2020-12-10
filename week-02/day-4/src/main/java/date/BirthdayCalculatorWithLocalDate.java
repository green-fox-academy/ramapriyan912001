package date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayCalculatorWithLocalDate implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        return LocalDate.parse(str);
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        return ((LocalDate) date).getMonth().toString() + " " + ((LocalDate) date).getDayOfMonth();
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        return LocalDate.now().isEqual((LocalDate)date);
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        return LocalDate.now().getYear()-((LocalDate)birthday).getYear();
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        return (int) ChronoUnit.DAYS.between(((LocalDate)date), LocalDate.now());
    }

    public static void main(String[] args) {
        new BirthdayWithLocalDate().run();
    }

    protected void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
}

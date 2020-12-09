package Reservation;

import Flyable.Flyable;

import java.util.Random;

public class Reservation implements Reservationy {

    public static String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private String bookingCode;
    private String dayOfTheWeek;

    public Reservation(String dayOfTheWeek) {
        this.bookingCode = makeCode(new Random());
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public static String makeCode(Random random) {
        String s = "";
        while(s.length() < 8) {
            int i = random.nextInt();
            if (i < alphaNumeric.length() && i > -1) {
                s += alphaNumeric.charAt(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {

    }

    public String toString() {
        return String.format("Booking# %s for %s", bookingCode, dayOfTheWeek);
    }

    @Override
    public String getDowBooking() {
        return this.dayOfTheWeek;
    }

    @Override
    public String getCodeBooking() {
        return this.bookingCode;
    }
}

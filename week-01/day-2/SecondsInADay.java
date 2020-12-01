public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int total_seconds = 24*60*60;
    int remaining_secs = total_seconds - (currentHours*3600 +
    currentMinutes*60 + currentSeconds);
    System.out.println(remaining_secs);
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
  }
}
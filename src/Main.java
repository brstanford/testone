import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int days, weeks, hours, mins, secs;

        System.out.println("Please enter the number of weeks:");
        weeks = in.nextInt();

        System.out.println(weeks + " week is equal to:");
        days = weeks * 7;
        hours = days * 24;
        mins = hours * 60;
        secs = mins * 60;

        System.out.println(weeks + " weeks" + "\n" + days + " days" + "\n" + hours + " hours" + "\n" + mins + " mins" +
                "\n" + secs + " secs");

    }
}

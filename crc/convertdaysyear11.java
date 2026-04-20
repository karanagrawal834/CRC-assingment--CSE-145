import java.util.Scanner;
public class convertdaysyear11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int days = sc.nextInt();
        int years = days/365;
        int weeks = (days % 365) / 7;
        System.out.println(days);
        System.out.println(years);
        System.out.println(weeks);
    }

    
}

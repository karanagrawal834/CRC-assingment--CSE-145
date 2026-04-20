import java.util.Scanner;

public class StringLength54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int count = 0;
        for (char c : s.toCharArray())
            count++;

        System.out.println("Length = " + count);
    }
}
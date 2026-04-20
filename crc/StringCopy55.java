import java.util.Scanner;

public class StringCopy55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        char[] arr = s1.toCharArray();
        String s2 = "";

        for (char c : arr)
            s2 = s2 + c;

        System.out.println("Copied string: " + s2);
    }
}
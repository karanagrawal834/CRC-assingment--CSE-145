import java.util.Scanner;

public class StringConcatenation56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String result = "";

        for (char c : s1.toCharArray())
            result += c;

        for (char c : s2.toCharArray())
            result += c;

        System.out.println("Concatenated: " + result);
    }
}
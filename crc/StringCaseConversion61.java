import java.util.Scanner;

public class StringCaseConversion61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String upper = "", lower = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                upper += (char)(ch - 32);
            else
                upper += ch;

            if (ch >= 'A' && ch <= 'Z')
                lower += (char)(ch + 32);
            else
                lower += ch;
        }

        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
    }
}
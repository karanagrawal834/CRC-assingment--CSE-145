import java.util.Scanner;

    public class StringComparison57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Equal");
            return;
        }

        boolean equal = true;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                equal = false;
                break;
            }
        }

        if (equal)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
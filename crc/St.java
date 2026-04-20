import java.util.Scanner;

public class St {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1))
                count++;
            else {
                result += s.charAt(i) + "" + count;
                count = 1;
            }
        }
        result += s.charAt(s.length()-1) + "" + count;

        System.out.println(result);
    }
}
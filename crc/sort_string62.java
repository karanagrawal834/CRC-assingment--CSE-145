import java.util.Scanner;

public class sort_string62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLine();

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (String s : arr)
            System.out.println(s);
    }
}
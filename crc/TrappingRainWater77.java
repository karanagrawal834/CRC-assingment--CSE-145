import java.util.Scanner;

public class TrappingRainWater77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();

        int water = 0;

        for (int i = 1; i < n-1; i++) {
            int left = h[i], right = h[i];

            for (int j = 0; j < i; j++)
                left = Math.max(left, h[j]);

            for (int j = i+1; j < n; j++)
                right = Math.max(right, h[j]);

            water += Math.min(left, right) - h[i];
        }

        System.out.println("Water = " + water);
    }
}
import java.util.Scanner;
public class sici6{
public static void main(String[] args) {

        // compound interest
        Scanner sc = new Scanner(System.in);
        int p = 1000;
        float r = 5.0f;
        int t = 2;
        float a = p * (float)Math.pow(1 + r/100, t);
        float ci = a - p;
        System.out.println("Compound Interest: " + ci);
    }
}
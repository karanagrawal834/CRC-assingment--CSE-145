import java.util.Scanner;
public class rootsquadratic16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the coefficients a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double D = b*b - 4*a*c; // discriminant
         if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2*a);
            double root2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("The roots are real and distinct: " + root1 + " and " + root2);
    
    }
}
}

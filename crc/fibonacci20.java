import java.util.Scanner;
public class fibonacci20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms in the fibonacci series :");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("fibonacci series : ");
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        
    }
    
}

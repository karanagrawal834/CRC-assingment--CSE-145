import java.util.Scanner;

public class MatrixEquality53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        System.out.println("Enter first matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j] = sc.nextInt();

        boolean equal = true;

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(a[i][j] != b[i][j])
                    equal = false;

        if(equal)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }
}
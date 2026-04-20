import java.util.Scanner;

public class circle7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enter the radius of the circle :");
     float r = sc.nextFloat();
     float area = (float) (Math.PI * r * r);
     float circumference = (float) (2 * Math.PI * r);    
     System.out.println("Area of the circle: " + area);
     System.out.println("Circumference of the circle: " + circumference);
  }  
	
}

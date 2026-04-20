public class checkno9 {
    // Check if a number is even or odd (using bitwise operators).
    public static void main(String[] args) {
        int num = 10; 
        if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    } 
    
}

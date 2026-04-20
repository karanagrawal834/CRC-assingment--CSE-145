public class strongno25  {
    public static void main(String[] args) {
        int num = 145; 
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is a Strong number");
        } else {
            System.out.println(temp + " is NOT a Strong number");
        }
    }
}
    


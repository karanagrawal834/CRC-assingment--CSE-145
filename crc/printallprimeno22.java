public class printallprimeno22 {
    public static void main(String[] args) {
        int n = 100; 

        System.out.println("Prime numbers up to " + n + ":");
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}

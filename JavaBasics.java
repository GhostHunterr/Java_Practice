public class JavaBasics {

    public static boolean isPrime(int n) {
        // corner Case
        // n = 2
        if (n == 2) {
            return true;
        }

        // n>2;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {//Outer Loop (Goes over each number)
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {//Inner Loop (Checks each number)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("******Testing Starts!******");
        primeInRange(10);
        System.out.println("******Testing Ends!********");
    }
}

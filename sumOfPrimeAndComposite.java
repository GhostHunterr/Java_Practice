import java.util.Scanner;

public class sumOfPrimeAndComposite {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int primeSum = 0;
        int compositeSum = 0;
        int x;

        do {
            System.out.print("Enter a number(-1 to exit): ");
            x = scn.nextInt();
            boolean isPrime = true;
            if (x != -1) {

                for (int i = 2; i <= Math.sqrt(x) && isPrime; i++) {
                    if (x % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    primeSum += x;
                } else {
                    compositeSum += x;
                }
            }
        } while (x != -1);

        System.out.println("Sum of Prime numbers is: " + primeSum);
        System.out.println("Sum of Composite numbers is: " + compositeSum);
        scn.close();
    }
}

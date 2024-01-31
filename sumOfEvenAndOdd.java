import java.util.Scanner;

public class sumOfEvenAndOdd {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int x;

        do {
            System.out.print("Enter a number(-1 to exit): ");
            x = scn.nextInt();
            boolean flag = true;
            if (x != -1) {

                if (x % 2 == 0) {
                    flag = false;
                }
                if (flag) {
                    oddSum += x;
                } else {
                    evenSum += x;
                }
            }
        } while (x != -1);

        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("Sum of odd numbers is: " + oddSum);
        scn.close();
    }
}

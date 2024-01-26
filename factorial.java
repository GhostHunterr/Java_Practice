import java.util.*;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int x = sc.nextInt();
        long total = 1;
        if (x > 1) {

            for (int i = 1; i <= x; i++) {
                total *= i;
            }
        }
        System.out.println("Factorial of " + x + " is " + total);
        sc.close();
    }
}

import java.util.*;

public class reverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        long x = sc.nextInt();
        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        System.out.println("The Reverse is: " + reverse);
        sc.close();
    }

}

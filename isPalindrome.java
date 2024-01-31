import java.util.*;

public class isPalindrome {

    public static boolean isPal(long n) {
        if (n < 0) {
            return false;
        } else if (n >= 0 && n <= 9) {
            return true;
        }

        long original = n;
        long reverse = 0;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return n == reverse;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(isPal(n) ? n + " is a Palindrome" : n + " is not a Palindrome");
        sc.close();
    }
}

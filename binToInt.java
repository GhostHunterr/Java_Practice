import java.util.Scanner;

public class binToInt {

    public static int bintoInt(int n) {
        int x = 0;
        for (int i = 0; n != 0; i++) {
            x += (n % 10) * Math.pow(2, i);
            n /= 10;
        }
        return x;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        int n = sc.nextInt();
        System.out.println("Integer value of Binary " + n + " is " + bintoInt(n));
        sc.close();
    }
}

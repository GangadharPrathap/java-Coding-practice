import java.util.Scanner;

public class dsa3 {
    static int getReverse(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if (n == getReverse(n)) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }
}
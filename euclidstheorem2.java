import java.util.Scanner;

public class euclidstheorem2 {

    public static int gcd(int a, int b) {
        // Continue the loop until b becomes zero
        while (b != 0) {
            int temp = b; // Store current b
            b = a % b; // Replace b with a % b
            a = temp; // Replace a with old b
        }
        return a; // When b is 0, a contains the GCD
    }

    public static void main(String[] args) {
        System.out.println("Enter any Two numbers to find the GCD");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

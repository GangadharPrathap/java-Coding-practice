import java.util.Scanner;

public class dsa1 {
    public static void main(String[] args) {
        System.out.println("23-06-2025");
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num1, num2 = 0;
        num1 = input.nextInt();
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                num2 = num2 + i;
            }
        }
        if (num2 == num1) {
            System.out.printf("the number %d is a perfect number.", num2);
        } else {
            System.out.printf("the number %d is not a perfect number.", num2);
        }
        for (int j = 1; j < Math.sqrt(num1); j += 2) {
            if (num1 % j == 0) {
                num2 = num2 + j;
            }
        }
        if (num2 == num1) {
            System.out.printf("the number %d is a perfect number.", num2);
        } else {
            System.out.printf("the number %d is not a perfect number.", num2);
        }
    }
}

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        System.out.println("Methods or functions");
        // take an input of two numbers and print the sum of them
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of both numbers will be : " + sum);

    }
}
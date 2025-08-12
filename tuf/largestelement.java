import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] nums;
        int n = sc.nextInt();
        nums = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int largest = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("the largest element in the array is : " + largest);
    }
}
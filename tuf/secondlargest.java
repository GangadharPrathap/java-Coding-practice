import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        nums = new int[n];
        System.out.println("Enter the values of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int largest = nums[0];
        int slargest = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }
        System.out.println(slargest);
    }
}

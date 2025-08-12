import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums;
    int n = sc.nextInt();
    nums = new int[n];
    for(int i =0 ; i < n ; i++){
        nums[i] = sc.nextInt();
    }
    int largest =  nums[0];
    for(int i = 0;i<n;i++){
    if(nums[i]>largest){
        largest = nums[i];
    }
    }
    System.out.println(largest);
}
}
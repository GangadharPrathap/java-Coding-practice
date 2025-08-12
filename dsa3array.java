import java.util.Scanner;
public class dsa3array {
  public static void main(String[] args) {
    // Read the length of array first
    Scanner read = new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int n = read.nextInt();
    // Declare an array of size N
    int[] arr = new int[n];
    System.out.println("Enter the elements in the array");
    // Read array elements
    for (int i = 0; i < n; i++) {
      arr[i] = read.nextInt();
    }
    System.out.println("the sqaures of the elements are:");
    // Print / Access the elements of an array
    for (int i = 0; i < n; i++)
    {
      System.out.println(arr[i] * arr[i]);
    }

  }
}

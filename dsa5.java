import java.util.Scanner;

public class dsa5 {
    public static void main(String[] args) {
        System.out.println("Value based loop");
        Scanner sc = new Scanner(System.in);
        String[] arr = { "po", "kai", "shifu", "tigress" };
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("........................");
        for (String eachName : arr) {
            System.out.println(eachName);
        }
    }
}
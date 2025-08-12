import java.util.Scanner;

public class dsa2 {
    public static void main(String[] args) {
        System.out.println("Prime number code");
        System.out.println("Enter a number: ");
        int num1;
        Scanner input=new Scanner(System.in);
        num1=input.nextInt();
        for(int i=2;i<=Math.sqrt(num1);i++){
            if(num1%i==0){
                return;
            }
        }


    }
}
/*
 * static boolean isprime(int n){
 * if(n<2)return false;
 * //Generating the numbers from 2 to sqrt(n)
 * for (int i=2;i<=(int)Math.sqrt(n);i++){
 * if(n%i==0)return false;}
 * return true}
 * Sieve of Eratosthenes method is used in order to get the prime in the given
 * range
 */
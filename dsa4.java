import java.util.Scanner;

public class dsa4 {
    static int getgcd(int a,int b){
        // generate factors of a
        int gcd=1;
        for(int i=1;i<=a;i++){
            if (a%i==0 && b%i==0) {
                gcd=i;
            }
        }return gcd;
    }
    static int getlcm(int a,int b) {
        // generate the multiples of a and b
        int i=1;
        int lcm=1;
        while(true){
            // generatting the multiples of a
            int m=a*i;
            if(m%b==0){
                lcm=m;
                break;
            }i++;
        }return lcm;
    }
    public static void main(String[] args) {
        System.out.println("GCD of Two numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The LCM of "+a+" and "+b+" is "+getlcm(a, b));
        System.out.println("The GCD of "+a+" and "+b+" is "+getgcd(a,b));
    }
}
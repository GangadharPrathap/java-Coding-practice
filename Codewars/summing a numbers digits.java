public class kata{
  public static int sumDigits(int number){
    if(number>0){
    number*=(-1);
    }int s=0;
    while(number!=0){
    int n = number%10;
    s+=n;
    number/=10;  
    }return s;
  }}

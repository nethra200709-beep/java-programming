import java.util.Scanner;
public class Armstrong{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      while(n!=0){
        int d=n%10;
        sum=sum+d*d*d;
        n=n/10;
      }
      System.out.println(sum);
   }
}
import java.util.Scanner;
public class citizen{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if (age>=60){
      System.out.println("you are a senior citizenship");
    }
    else{
      System.out.println("you are not a senior citizenship");
    }
  }
}  
import java.util.Scanner;
class User{
  int acc_no;
  string name;
  int balance;
  
  User(int a,string b,int c){
    acc_no=a;
    name=b;
    balance=c;
  }
   
  public void deposit(int d){
    balance=balance+d;
  }
  public void withdraw(int e){
    balance=balance-e;
  }
  public void view_balance(){
    System.out.println("ENTER ACCOUNT NUMBER:"+acc_no);
    System.out.println("ENTER NAME:"+acc_no);
    System.out.println("ENTER BALANCE"+acc_no);
  }
public class Bank{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      string b=next();
      int c=nextInt();
      Bank ac=new Bank();
      ac.deposit(1000);
      ac.withdraw(500);
      ac.view_balance();
   } } } 
      
    
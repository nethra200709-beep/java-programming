class Calculator2{
  int add(int a,int b){
    return a+b;
  }
  int add(int a,int b,int c){
    return a+b+c;
  }
  double add(double a,double b){
    return a+b;
  }
  public static void main(String[] args){
    Calculator2 abc = new Calculator2();
    int a=abc.add(2,5);
    System.out.println(a);
    int b=abc.add(2,3,4);
    System.out.println(b);
    double c=abc.add(1,3,2);
    System.out.println(c);
  } }
    
    
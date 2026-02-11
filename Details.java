import java.util.Scanner;

class Stud {
    int sno;
    String name;
    int age;
    String department;
    int mark1;
    int mark2;
    int total;

    
    Stud(int a, String b, int c, String d, int e, int f) {
        sno = a;
        name = b;
        age = c;
        department = d;
        mark1 = e;
        mark2 = f;
    }

    
    void calculate() {
        total = mark1 + mark2;
    }

    
    void display() {
        System.out.println("Register no: " + sno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Total: " + total);
    }
}

public class Details {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Register No:");
        int sno = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Department:");
        String department = sc.next();

        System.out.println("Enter Mark1:");
        int mark1 = sc.nextInt();

        System.out.println("Enter Mark2:");
        int mark2 = sc.nextInt();

        Stud s1 = new Stud(sno, name, age, department, mark1, mark2 );
        s1.calculate();
        s1.display();

        
    }
}
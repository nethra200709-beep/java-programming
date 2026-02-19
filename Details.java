import java.util.Scanner;

class Student {
    String name;
    int register;
    int age;
    String department;

    
    Student(String a, int b, int c, String d) {
        name = a;
        register = b;
        age = c;
        department = d;
    }

    void disp1() {
        System.out.println("Name: " + name);
        System.out.println("Register: " + register);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

class Mark extends Student {
    int mark1, mark2, mark3, total;
    float average;
    String result;

    
    Mark(String name, int register, int age, String department,
         int m1, int m2, int m3) {

        super(name, register, age, department);
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculate() {
        total = mark1 + mark2 + mark3;
        average = total / 3;

        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    void disp2() {
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}

public class Details {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NAME:");
        String name = sc.next();

        System.out.println("ENTER REGISTRATION NUMBER:");
        int register = sc.nextInt();

        System.out.println("ENTER AGE:");
        int age = sc.nextInt();

        System.out.println("ENTER DEPARTMENT:");
        String department = sc.next();

        System.out.println("ENTER THREE MARKS:");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        Mark mar = new Mark(name, register, age, department,
                            mark1, mark2, mark3);

        mar.calculate();
        mar.disp1();
        mar.disp2();

        
    }

}

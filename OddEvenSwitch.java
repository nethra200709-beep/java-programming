import java.util.Scanner;
public class OddEvenSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
    }
}

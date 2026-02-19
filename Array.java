import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        try {
            System.out.println("Enter index (0 to 2): ");
            int index = sc.nextInt();

            System.out.println("Enter value: ");
            int value = sc.nextInt();

            arr[index] = value; 

            System.out.println("Value inserted successfully");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        finally {
            System.out.println("This will always execute");
        }
    }
}
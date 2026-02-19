import java.util.Scanner;
class NumberFormat {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try {
            System.out.println("Enter a number: ");
            String input = sc.nextLine();   
            int num = Integer.parseInt(input);  

            System.out.println("You entered: " + num);
        }
       catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
       finally {
            System.out.println("Program finished");
        }
    }
}
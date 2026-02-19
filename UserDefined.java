import java.util.Scanner;
class UserDefined {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}



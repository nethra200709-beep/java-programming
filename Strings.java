import java.util.Scanner;
class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("Original: " + a);
        System.out.println("Length: " + a.length());
        System.out.println("Uppercase: " + a.toUpperCase());
        System.out.println("Lowercase: " + a.toLowerCase());
        System.out.println("Index of 'a': " + a.indexOf('a'));
        System.out.println("Char At:"+a.charAt(2));
        System.out.println("First 3 characters: " + a.substring(0,3));
        System.out.println("Replace 'a' with '*': " + a.replace('a', '*'));

     

        
       

        
    }
}
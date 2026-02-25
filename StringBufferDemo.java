import java.util.Scanner;
class StringBufferDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String b = sc.nextLine();
        StringBuffer sb = new StringBuffer(b);
        System.out.println("Original String: " + sb);
        System.out.println("After Append: " + sb.append(" Java"));
        System.out.println("After Insert: " +sb.insert(0, "Hello!!!"));
        System.out.println("After Replace: " + sb.replace(0, 5, "Hi"));
        System.out.println("After Delete: " +sb.delete(0, 3));
        System.out.println("After Reverse: " +sb.reverse());
        System.out.println("Length: " + sb.length());

        
    }
}
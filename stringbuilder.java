//string builder , charat and insert method
public class stringbuilder {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        System.out.println("The characters in the string are:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i)); 
        }

        StringBuilder sb = new StringBuilder(input);
        sb.insert(0, "Modified: "); 
        System.out.println("After insertion: " + sb.toString());

        scanner.close(); 
    }
}
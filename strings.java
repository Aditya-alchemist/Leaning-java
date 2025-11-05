public class strings {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        System.out.println("The characters in the string are:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i)); 
        }

        scanner.close(); 

        string sample = "Hello, World!";
        string upperSample = sample.toUpperCase();
        System.out.println("Original String: " + sample);
    }
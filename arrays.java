import java.util.*;

public class arrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size]; 

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); 
        }

        System.out.println("The numbers in the array are:");
        for (int num : numbers) {
            System.out.println(num); 
        }

        scanner.close(); 
    }
}
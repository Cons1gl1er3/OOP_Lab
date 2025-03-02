import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum;
    }

    public static double calculateAverage(int[] array) {
        return (double) calculateSum(array) / array.length;
    }	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to enter the array manually? (yes/no): ");
        String userInput = scanner.nextLine().trim().toLowerCase();

        int[] array;
        if (userInput.equals("yes")) {
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            array = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) array[i] = scanner.nextInt();
        } else {
            array = new int[]{5, 3, 8, 1, 2};
            System.out.println("Using the constant array: [5, 3, 8, 1, 2]");
        }

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum: " + calculateSum(array));
        System.out.println("Average: " + calculateAverage(array));

        scanner.close();
    }
}

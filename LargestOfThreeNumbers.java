import java.util.Arrays;
import java.util.Scanner;

public class LargestOfThreeNumbers {

    // Approach 1: Using Conditional Statements
    public static int findLargestUsingConditional(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    // Approach 2: Using Math.max() Function
    public static int findLargestUsingMathMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Approach 3: Sorting the Numbers
    public static int findLargestUsingSorting(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Call each method and print the result
        int largest1 = findLargestUsingConditional(num1, num2, num3);
        System.out.println("Largest Number (Conditional): " + largest1);

        int largest2 = findLargestUsingMathMax(num1, num2, num3);
        System.out.println("Largest Number (Math.max()): " + largest2);

        int largest3 = findLargestUsingSorting(num1, num2, num3);
        System.out.println("Largest Number (Sorting): " + largest3);
    }
}

package ctaRecursionNumSum;

import java.util.Scanner;

//This program allows user to enter five numbers, then calculates sum of these numbers with recursion.

public class NumbSum {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];	
        
        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = calculateSum(numbers, 5);
        System.out.println("The sum of the numbers is: " + sum);
    }
}

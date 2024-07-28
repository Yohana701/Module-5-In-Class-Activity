import java.util.*;


public class DistanceFromAverage {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double[] numbers = new double[15];
       double entry;
       double total = 0;
       double average = 0;
       final int QUIT = 99999;
       int x = 0, y;


       System.out.print("Enter a numeric value or " + QUIT + " to quit >> ");
       entry = input.nextDouble();


       // Use a while loop to input numbers
       while (entry != QUIT && x < numbers.length) { // Removed semicolon at the end of the condition
           numbers[x] = entry;
           total += numbers[x];
           ++x;


           // Check if there's space in the array for more inputs
           if (x < numbers.length) {
               System.out.print("Enter next numeric value or " + QUIT + " to quit >> ");
               entry = input.nextDouble();
           }
       }


       // Check if no numbers were entered
       if (x == 0) {
           System.out.println("Average cannot be computed because no numbers were entered");
       } else {
           average = total / x;
           System.out.println("You entered " + x + " numbers and their average is " + average);


           // Calculate and display distance from average for each number entered
           for (y = 0; y < x; ++y) {
               System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average");
           }
       }


       input.close(); // Close the Scanner object
   }
}

import java.util.*;


public class CarCareChoice {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String entry;
       boolean isMatch = false;
       String[] items = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
       int[] prices = {25, 22, 15, 5};
       int matchIndex = 0;


       for (int x = 0; x < items.length; ++x)
           System.out.println(items[x]);




       System.out.print("Enter Selection >> ");
       entry = input.nextLine();


       // Check if the entered selection matches an item
       for (int x = 0; x < items.length; x++)
           if (entry.equalsIgnoreCase(items[x]))
           {
               isMatch = true;
               matchIndex = x;
       }
      
       if (isMatch) {
           System.out.println(entry + " price is $" + prices[matchIndex]);
       } else {
           System.out.println("Invalid Input!");
       }


       input.close();
   }
}


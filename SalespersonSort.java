import java.util.*;
public class SalespersonSort
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       Salesperson[] salespeople = new Salesperson[7];
       int x;
       int id;
       double sales;
       String order;
       String message = "";
       for(x = 0; x < salespeople.length; ++x)
       {
           System.out.print("Enter an ID number >> ");
           id = input.nextInt();
           System.out.print("Enter a sales value >> ");
           sales= input.nextDouble();
           salespeople[x] = new Salesperson(id, sales);
       }
       input.nextLine();
       System.out.println("By which field do you want to sort?");
       System.out. print("(I)d number or (S)ales >> ");
       order = input.nextLine();
       if(order.charAt(0) == 'I')
           sortById(salespeople);
       else
           sortBySales(salespeople);
       for(x = 0; x < salespeople.length; ++x)
       {
           System.out.println("ID " + salespeople[x].getId() +
                   "  sales: " + salespeople[x].getSales());
       }
   }
   public static void sortById(Salesperson[] array)
   {
       int a,b;
       Salesperson temp;
       int highSubscript = array.length - 1;
       for(a = 0; a < highSubscript; ++a)
           for(b = 0; b < highSubscript; ++b)
           {
               if(array[b].getId() > array[b + 1].getId())
               {
                   temp = array[b];
                   array[b] = array[b + 1];
                   array[b + 1] = temp;
               }
           }
   }
   public static void sortBySales(Salesperson[] array)
   {
       int a,b;
       Salesperson temp;
       int highSubscript = array.length - 1;
       for(a = 0; a < highSubscript; ++a)
           for(b = 0; b < highSubscript; ++b)
           {
               if(array[b].getSales() > array[b + 1].getSales())
               {
                   temp = array[b];
                   array[b] = array[b + 1];
                   array[b + 1] = temp;
               }
           }
   }
}

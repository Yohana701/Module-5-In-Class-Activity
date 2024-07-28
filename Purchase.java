public class Purchase {
   private int invoiceNumber;
   private double salesAmount;
   private double salesTax;


   // Set method for invoice number
   public void setInvoiceNumber(int invoiceNumber){
       this.invoiceNumber = invoiceNumber;
   }


   // Set method for sales amount and calculate sales tax
   public void setSalesAmount(double salesAmount){
       this.salesAmount = salesAmount;
       this.salesTax = salesAmount * 0.05; // Calculate sales tax as 5% of sales amount
   }


   // Display method
   public void display(){
       System.out.println("Invoice Number: " + invoiceNumber );
       System.out.println("Sales Amount: $" + salesAmount);
       System.out.println("Sales Tax: $" + salesTax);
   }


   // Main method for testing
   public static void main(String[] args){
       Purchase purchase = new Purchase();
       purchase.setInvoiceNumber(12345);
       purchase.setSalesAmount(200.0);
       purchase.display();
   }
}

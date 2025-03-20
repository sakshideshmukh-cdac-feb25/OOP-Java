import java.lang.*;
import java.util.*;
class ElectricityBill{
	String customerName;
	double unitsConsumed;
	double billAmount; 
	
	
		void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5; // Rs. 5 per unit for first 100 units
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7; // Rs. 7 per unit for 101 to 300 units
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10; // Rs. 10 per unit above 300 units
        }
    
	}
	
	
	
	public  ElectricityBill(String customerName, double unitsConsumed ){
	
	
	 if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
		
	this.customerName=customerName;
this.unitsConsumed=unitsConsumed;
        calculateBillAmount(); // Automatically calculate bill after object creation
}


	void printBill(){
		System.out.println("enter customer name : " +customerName);
				System.out.println("enter unitsConsumed : "+unitsConsumed);
								System.out.println("Bill amount is: "+billAmount);

	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		try{
		System.out.println("enter customer name : ");
		String customerName=sc.nextLine();
		System.out.println("enter unitsConsumed : ");
		double unitsConsumed=sc.nextDouble();
		
		
	   // Create ElectricityBill object
            ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);

            // Print the bill details
            bill.printBill();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter a numeric value for units consumed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
        }
    }
}
class BMICalculator{
	double height;
	double weight;
	double BMI;
	 public BMICalculator() {
        height = 0.0;
        weight = 0.0;
    }

	//parameterized constructor
	public BMICalculator(double height,double weight){
	this.height=height;
	this.weight=weight;
	}
	  // Getter for height
	  
	  public double getHeight(){
	  return height;}
	  
	  //setter
	  public void setHeight(double height){
	  this.height=height;
	  } 
	  //getter
	   public double getWeight(){
	  return weight;}
	  
	  //setter
	  public void setWeight(double weight){
	  this.weight=weight;

	  } 
	  
	  public double calculateBMI(){
		  BMI=weight/(height*height);
		  	  return BMI;
	  }
	  public void display(){
		 
		    System.out.printf("BMI is: %.2f\n", BMI);
	  }


}
class BMICalculatorDemo{
	public static void main(String[] args){
	BMICalculator bmi=new BMICalculator();
	bmi.setHeight(1.70);
	bmi.setWeight(65);
	
	 System.out.println("Enter height (in meter):- " +bmi.getHeight() + " meter");
	 	 System.out.println("Enter weight (in kg):- " +bmi.getWeight() + " kg");
	bmi.calculateBMI();
	bmi.display();
	
	}
}
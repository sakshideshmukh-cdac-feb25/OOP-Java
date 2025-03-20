import java.util.*;
class Student{
	String name;  
    int rollNo; 
  double marks[]=new double[5];  
  double average; 
  char grade;
  //constructor
  public Student(String name,int rollNo,double marks[]){
	  
	  
		  for (double mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Mark should be between 0 and 100.");
            }
        }
	  this.name=name;
	  this.rollNo=rollNo;
	  this.marks=marks;
	  
  }
  
  public void calculateAverage(){
	  double sum=0;
	   
		   
	  for(int i=0;i<5;i++){
		  sum+=marks[i];
	  }
	average=sum / 5;
  }
  
  
  public void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
   public void displayStudentInfo(){
	   System.out.println("Enter student name : "+name);
	   	   System.out.println("Enter student roll No : "+rollNo);
		   
	  System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
	   System.out.println(" average of marks : "+average);
		System.out.println("Grade: "+grade);
   }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            //  user for student details
            System.out.print("Enter student's name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            // Get marks for 5 subjects
            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects (between 0 and 100):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Mark for subject " + (i + 1) + ": ");
                marks[i] = sc.nextDouble();
            }

            // Create a Student object
            Student student = new Student(name, rollNo, marks);

            // Calculate average and grade
            student.calculateAverage();
            student.calculateGrade();

            // Display student information
            student.displayStudentInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
        }
    }
}

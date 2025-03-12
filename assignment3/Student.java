

import java.util.Scanner;
class Student{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

int physicsMarks[]= new int[20];
int chemistryMarks[]=new int [20];
int mathMarks[]=new int [20];


for(int i=0;i<20;i++){
	System.out.println("enter physics marks: ");
	physicsMarks[i]=sc.nextInt();
	
	System.out.println("enter chemistry marks: ");
	chemistryMarks[i]=sc.nextInt();
	
	System.out.println("enter math marks: ");
	mathMarks[i]=sc.nextInt();
}
 System.out.println("\nPhysics Marks of 20 students:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Student " + (i + 1) +  ": Physics - " + physicsMarks[i] + ", Math - " + mathMarks[i] + ", Chemistry - " + chemistryMarks[i]); 
        }
		 int students75andAbove = 0;
        int students40andBelow = 0;

        // Calculate aggregate percentage and categorize students
        for (int i = 0; i < 20; i++) {
            // Calculate the total marks obtained by the student
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathMarks[i];

            // Calculate the aggregate percentage
            double aggregatePercentage = (totalMarks / 300.0) * 100;

            // Check if aggregate percentage is 75% and above
            if (aggregatePercentage >= 75) {
                students75andAbove++;
            }
            // Check if aggregate percentage is 40% and below
            if (aggregatePercentage <= 40) {
                students40andBelow++;
            }
        }

        // Display the result
        System.out.println("\nNumber of students securing 75% and above: " + students75andAbove);
        System.out.println("Number of students securing 40% and below: " + students40andBelow);

}




}

 
 
 import java.util.*;
 class Student{
	String name;
	int sum=0;
	int average;
	int marks[]=new int[3];
	
	public  Student(String name,int marks[]){
	this.name=name;
	this.marks=marks;}
	  
	 public void display(){
	 System.out.println("enter name of student: "+name);
	 for(int i=0;i<3;i++){
		System.out.println("enter marks of student: "+ marks[i]);}
		System.out.println();
		System.out.println("sum of marks is: "+sum);
		System.out.println("Average of marks is : "+average);
	 }
	public void calc(){
	
	for(int i=0;i<3;i++){
	sum+=marks[i];
	}
	for(int i=0;i<3;i++){
	average=sum/3;
	}
	}
 
 }
 class StudentDemo{
	 public static void main(String[] arge){
 Scanner sc= new Scanner(System.in);
 System.out.println("enter name of student: ");
	String name=sc.nextLine();
	int marks[]=new int[3];
	 for(int i=0;i<3;i++){
		System.out.println("enter marks of student: ");
		marks[i]=sc.nextInt();
		}
		sc.close();
		
	Student student=new Student(name,marks);
	student.calc();
	student.display();
 
	 }
 }
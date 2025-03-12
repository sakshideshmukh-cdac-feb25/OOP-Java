import java.util.Scanner;
class CountEO{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
	
		System.out.print("enter no : ");
		a[i]=sc.nextInt();}
		int CountEven=0;
		int CountOdd=0;
		for(int i=0;i<5;i++){
		System.out.println(a[i]);
		if(a[i] %2==0){
			CountEven++;
		}
		else{
			CountOdd++;
		}}
	System.out.println("even no: " + CountEven);
		System.out.println("odd no: " + CountOdd);


}}
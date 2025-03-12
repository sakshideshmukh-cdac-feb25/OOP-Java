import java.util.Scanner;
class Q12EO{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int arr[]=new int[20];
for(int i=0;i<20;i++){
	System.out.println("enter no: ");
	arr[i] = sc.nextInt();

	}
	int evenCount=0;
	int oddCount=0;
	int mulofthreee=0;
	for(int i=0;i<20;i++){
	System.out.println(arr[i]);
	
	
		if(arr[i] %2==0){
			evenCount++;}
		else{
	oddCount++;}
		if(arr[i] %3==0){
		mulofthreee++;}
		}
	
		System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
		 System.out.println("Number of multiples of 3 :  " + mulofthreee);
	
		
}
}
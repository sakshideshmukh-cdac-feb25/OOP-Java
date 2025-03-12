import java.util.Scanner;
class EvenOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<5;i++){
	System.out.println("enter no: ");
	arr[i] = sc.nextInt();

	}
	
for(int i=0;i<5;i++){
	System.out.println(arr[i]);
if(arr[i] %2==0){
	System.out.println("even no: ");}
	else{
		System.out.println("Odd no : ");}
		}
	}
}

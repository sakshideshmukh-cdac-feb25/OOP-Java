

	import java.util.Scanner;
class Q1LargeElement{
	static int largest(int[] arr){
	
			
	
	System.out.println("large no");
	int max=arr[0];
	for(int i=1;i<arr.length;i++){
	
	if(arr[i]>max){
	max=arr[i];}	
	}
	return max;
	}
		


	static int smallest(int[] arr){
	System.out.println("small no");
	int min=arr[0];
	for(int i=1;i<arr.length;i++){
	
	if(arr[i]<min){
	min=arr[i];}	
	}
	return min;
}
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[3];
	for(int i=0;i<arr.length;i++){
		System.out.println("enter no: " );
		arr[i] = sc.nextInt();
		}
	
	System.out.println(largest(arr));
	System.out.println(smallest(arr));
	
}
}
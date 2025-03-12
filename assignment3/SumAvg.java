class SumAvg{
public static void main(String[] args){
	int arr[]={1,4,3,5,6};
	int sum=0;
	for(int i=0;i<arr.length;i++){
	sum=sum+arr[i];
	System.out.println();
	}
	  double average = (double) sum / arr.length;

        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
	}}
class Largestnum{

static int Largeno(int[] x){
System.out.println("Large no: ");
int max=x[0];
for(int i=1;i<x.length;i++){
if(x[i]>max){
max=x[i];}
}
return max;


}





public static void main(String[] args){
int x[]={2,5,7,98,23,56,22};
	System.out.println(Largeno(x));

}}
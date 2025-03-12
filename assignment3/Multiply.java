class Multiply{
public static void main(String[] args){
	System.out.println("first matrix");
	int a[][]={{2,3},{5,6}};
	for(int i=0;i<2;i++){ 
		for(int j=0;j<2;j++)
		
	System.out.print(a[i][j]+" ");
	System.out.println();}
	System.out.println("second matrix");
	int b[][]={{5,7},{7,9}};
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++)
	System.out.print(b[i][j]+" ");
	System.out.println();}
	
	
System.out.println("multiplication of matrix");
	int mul[][]= new int[2][2];
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			mul[i][j] = 0; 
                for (int k = 0; k < 2; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
		mul[i][j]=a[i][j]*b[i][j];}
	}}

	for(int i=0;i<2;i++){ 
		for(int j=0;j<2;j++)
		
	System.out.print(mul[i][j]+" ");
	System.out.println();}













}
}
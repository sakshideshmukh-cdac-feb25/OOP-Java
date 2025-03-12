class Sum{
public static void main(String[] args){
 int a[][]={{4,5,6},{5,6,8},{5,8,9}};
 for(int i=0;i<3;i++){
	for(int j=0;j<3;j++)
	System.out.print(a[i][j]+ " ");
 System.out.println();}
 System.out.println("...");
  int b[][]={{4,5,6},{5,6,8},{5,8,9}};
 for(int i=0;i<3;i++){
	for(int j=0;j<3;j++)
	System.out.print(b[i][j]+ " ");
 System.out.println();}
 

System.out.println("Addition of two matrix is:");
int add[][]=new int[a.length][a[0].length];;

for(int i=0;i<3;i++){
	for(int j=0;j<3;j++)
add[i][j]=a[i][j]+b[i][j];	}

for(int i=0;i<3;i++){
	for(int j=0;j<3;j++)
 System.out.print(add[i][j]+ " ");
System.out.println();}
} }
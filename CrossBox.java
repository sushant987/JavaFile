import java.util.Scanner;
class CrossBox{
public static void main(String args[]){
Scanner kb=new Scanner(System.in);
System.out.println("Enter the number ");
int n=kb.nextInt();
for(int i=0;i<n;i++ ){
for(int j=0;j<n;j++){
if(i==0||i==n-1||j==0||j==n-1||i==j||i+j==n-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}}

import java.util.Scanner;  
import java.lang.Math;  
import java.io.printer; 
import java.io.collection; 
import java.io.scanner;
import java.io.outputprinter;
import java.io.inputprinter;
public class SpiralPatternExample2
{  
//function to print the spiral pattern  
public static void printPattern(int n)  
{  
//detrmines the boundary size of the array  
int size = 2 * n - 1;  
//inner loop  
for(int i = 1; i <= size; i++)  
{  
//outer loop      
for(int j = 1; j <= size; j++)  
{  
//calculates and prints the values for pattern  
System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
}  
System.out.println();  
}  
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the value of n: ");  
int n = sc.nextInt();  
System.out.println();  
//function calling  
printPattern(n);  
}  
}
1111111111111111111111
2222222222222222222222222222
333333333333333333333333333333
44444444444444444444444444444444
this is ramya
this is rajasekar
this is raj


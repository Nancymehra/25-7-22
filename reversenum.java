import java.util.Scanner;  
public class reverseNum 
{  
 	public static void reverseNum(int num)   		//method for reverse a number
	{  
		if (num < 10)   
		{  
 		  System.out.println(num);  					//prints the same number if the number is less than 10 
		  return;  
		}  
		else   
		{  
			System.out.print(num % 10);  
			reverseNum(num/10);  
		}  
	}  
public static void main(String args[])  
{  
	System.out.print("Enter the number : ");  
	Scanner sc = new Scanner(System.in);  
	int num = sc.nextInt();  
	System.out.print("The reverse of the given number is: ");  
	reverseNum(num);  						//method calling  
}  
} 
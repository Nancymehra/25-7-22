import java.util.Scanner;
class armstrongnumber
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
	
		boolean result = checkArmstrong(num);
		if(result)
		{
			System.out.println(num+"is an Armstrong number");
		}
		else{
			System.out.println(num+"is not an Armstrong number");
	}
}
	
	public static boolean checkArmstrong(int value)
	{
		int rem,temp=0, original=value;
		while(value !=0)
		{
			rem=value%10;
			temp=temp+ (rem*rem*rem);
			value/=10;
		}
		if (temp==original)
		{
			return true;
		}
		else{
			return false;
		}
}
}
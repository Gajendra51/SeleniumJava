import java.util.Scanner;
public class Reverse{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev=0;
		String numStg= String.valueOf(num);
		if(num!=0)
			
		{
			for(int i=0;i<numStg.length();i++)
			{
			int remainder = num%10;
			System.out.println(remainder);
			rev =rev*10 + remainder;
			System.out.println("     "+rev);
			num = num/10;
			System.out.println("                "+num);
			}
		}
		System.out.println("The Reverse of the given number is "+rev);
		
	}
	
}
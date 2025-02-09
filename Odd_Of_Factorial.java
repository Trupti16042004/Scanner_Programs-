import java.util.Scanner;
class Odd_Of_Factorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum=0;

		while(num>0)
		{
			int rem = num%10;
			for(int i=rem;i>=rem;i--)
			{

				System.out.println(i);
				if(rem%2!=0)
				{
					sum += rem;
				}
				
			}

			num = num/10;
		}
		System.out.println(sum);
	}
}
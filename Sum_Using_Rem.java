import java.util.Scanner;
class Sum _Using_Rem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum=0;

		while(num>0)
		{
			int rem = num%10;
			for(int i=1;i<rem;i++)
			{
				if(rem%2==0)
				{

					sum = sum+rem;
				System.out.println(sum);		
				}
				num = num/10;
			}


		}
}


	}

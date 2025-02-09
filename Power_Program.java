import java.util.Scanner;
class Power_Program
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter Number : ");
		int num = sc.nextInt();

		System.out.println("Enter Power : ");
		int pow = sc.nextInt();

		int a=1;

		for(int i=1; i<=pow;i++)
		{
			a=a*num;
		}
		System.out.println("POWER IS : "+a);

	}
}
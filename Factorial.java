import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int sum =0 ;
		System.out.println("FACTOR'S ARE : ");

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
				System.out.println(i);
				sum = sum + i;

			}
		
		}
			System.out.println("COUNT IS : "+cnt);
			
				System.out.println("SUM IS :"+sum);
		
	}

}

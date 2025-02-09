import java.util.Scanner;
class Words
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();


		switch(num)
		{
		case 1:
			if(num ==1)
			
			System.out.println("one");

		case 2:
			if(num==1 && num==2)
			System.out.println("two");

		case 3:
			if(num==1 && num==2 && num==3)
			System.out.println("three");


		}
	}
}
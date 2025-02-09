import java.util.Scanner;
class Square_Root
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int cnt =1;
		//
		for(int i=1;i<num;i++)
		{
			int root = cnt*i;
			if(root == num)
			{
				System.out.println(cnt);
				
			}
			cnt++;
		}


	}
}
 import java.util.Scanner;
 class Sum_Using_For
 {
 	public static void main(String[] args) {
 		
 		Scanner sc = new Scanner(System.in);

 		System.out.println("Enter a Number : ");
 		int num = sc.nextInt();
 		int sum=0;

 			// i = 12 12>0
 		for(int i=num;i>0;i++)
 		{
 			int rem = num%10;	// 123%10 = 2
 			sum = sum+rem;		//3+2=5
 			num /=10;			//1
 		}
 		System.out.println(sum);


 	}
 }
import java.util.Scanner;
class Game
{
	public static void main(String[] args) {

 	Scanner sc = new Scanner(System.in);
		int rNum=0;
		for( ; ; )
		{
			int num = (int)(Math.random()*10);

			if(num>=1 && num<=3)
			{
				rNum=num;
				break;

			}
		}
	
		String codeOtp = null;
		if(rNum==1)
		{
			codeOtp="STONE";

		}

		else if(rNum==2)
		{
			codeOtp="PAPER";
		}

		else if(rNum==3)
		{
			codeOtp="SCISSOR";
		}

		System.out.println();
		System.out.println("******WELCOME******");
		System.out.println();

		System.out.print("Enter Option : ");
		int opt = sc.nextInt();
		System.out.println(opt);


		String userOpt =null;

		if(opt==1)
		{
			userOpt = "STONE";
		}

		else if(opt==2)
		{
			userOpt = "PAPER";

		}

		else if (opt==3)
		{
			userOpt = "SCISSORS";

		}
		else {

			System.out.println("INVALID INTPUT");
			return;

		}

		System.out.println("USER VALUE : " + userOpt + "BOT VALUE : " + codeOtp);
		if((opt==1 && rNum==3)||(opt==2&&rNum==1)||(opt==3&&rNum==2))
		{
			System.out.println("USER WON");
		}

		else if ((opt==1 && rNum==2)||(opt==2&&rNum==3)||(opt==3 && rNum==1)) {
			System.out.println("BOT WON");
			

		}
		else {
			System.out.println("TIE");
		}

	}
}

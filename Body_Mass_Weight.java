import java.util.Scanner;
class Body_Mass_Weight
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Weight : ");
			float weight = sc.nextFloat();
			System.out.print("Enter Height : ");
			float height = sc.nextFloat();

			float kg =  weight * 0.45359237f;
			float h1 =height * 0.0254f;


			float BMI = kg/(h1*h1);

			System.out.print("BMI"+BMI);

	}
}
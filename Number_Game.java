import java.util.*;

class Number_Game
{

	// Random input
	public static void random(int score)
	{
		Random ran=new Random();
		int rand_num=ran.nextInt(10);
		guess(rand_num+1,score);
	}

	public static void guess(int random,int score)
	{
		// User input
		Scanner scan=new Scanner(System.in);

		System.out.print("\n\n Enter the Number (1 to 10) :	");
		int guess=scan.nextInt();

		int tries=0,win=0;

		// Wrong guess
		while(guess!=random)
		{
			tries++;

			if(guess>random)
				System.out.println("\n Your Guess is too High ");
			else
				System.out.println("\n Your Guess is too Low ");

			System.out.print("\n Play again :	");

			guess=scan.nextInt();
		}	
	
		//Right guess
		score+=++win;
		System.out.println("\n Right guess ");
		System.out.println("\n Tries : "+tries);
		System.out.println("\n Score : "+score);

		// Round win
		if(win>tries)
			System.out.println("\n This round to win ");

		// Play or Exit game
		System.out.print("\n\n If play again or not, pleace enter Y (Yes) or N (No) :	 ");
		char game=scan.next().charAt(0);
		if(game=='Y' || game=='y')
			random(score);
		else
			System.out.println("\n\t\t To Exit in the Number Game");

	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\n\t\t * * * * *   Welcome to Number Game   * * * * * ");

		System.out.print("\n Enter the Name : ");
		String name=scan.nextLine();

		int score=0;
		random(score);
	
	}

}
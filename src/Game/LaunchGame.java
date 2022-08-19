package Game;

import java.util.Scanner;

class Guesser
{  
	int guessNum;
	int range=10;
	


	public int guessNumber(){
		System.out.println("Hey Guesser! Kindly guess the number in your mind and within the range under 10!");

		Scanner sc = new Scanner(System.in);

		int guessNum=sc.nextInt();
		
	
		
		
		return guessNum;
		
	}
	
}

class Player{
	int guessNum;
	
	public int guessNumber(){
		
		System.out.println("Come on Players, now its your turn....guess the number in your mind!");

		Scanner sc = new Scanner(System.in);

		int guessNum=sc.nextInt();
		
		return guessNum;
		
	}
	
}

class Umpire{
	
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	public void collectfromGuesser(){
		Guesser g = new Guesser();
		numfromGuesser=g.guessNumber();
		
	}
	public void collectfromPlayer(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numfromPlayer1=p1.guessNumber();
		numfromPlayer2=p2.guessNumber();
		numfromPlayer3=p3.guessNumber();

		
		
		
	}
	public void compare() {
		
		if(numfromGuesser==numfromPlayer1) {
			if(numfromGuesser==numfromPlayer1&&numfromPlayer1==numfromPlayer2&&numfromPlayer1==numfromPlayer3)
				System.out.println("Congratulations!!!!!, All the players has won the game!!!");
			else if(numfromGuesser==numfromPlayer1&&numfromPlayer1==numfromPlayer2)
				System.out.println("Congratulations!!!, Player 1 and Player 2 are the winners!");
			else if(numfromGuesser==numfromPlayer1 && numfromGuesser==numfromPlayer3 )
				System.out.println("Congratulations!!!, Player 1 and Player 3 are the winners");
			else
				System.out.println("Player 1 wins the game!");
		}
		else if(numfromGuesser==numfromPlayer2) {
			if(numfromGuesser==numfromPlayer2&&numfromPlayer2==numfromPlayer3) {
				System.out.println("Congratulations, Player 2 and Player 3 are the winners!!!");
			}
			else
				System.out.println("Player 2 wins the game");
		}
		else if(numfromGuesser==numfromPlayer3) {
			System.out.println("Player 3 wins the game");
		}
		else
			System.out.println("Oh My God...! Tough Luck!! No one won the game, Try again!!!!!!!!");
		
	}
	
}
public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Umpire u = new Umpire();
		u.collectfromGuesser();
		u.collectfromPlayer();
		u.compare();

	}

}

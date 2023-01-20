package oops;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome! Take this Quiz and find your score! Best of Luck!");
		System.out.println("Question 1: \nWhich movie won the Oscar for Best Picture in 2019?");
		System.out.println("a) Once Upon a Time... in Hollywood\nb) Portrait of a Lady on Fire\n"
				+ "c) Parasite\nd) Joker");
		String a = scan.nextLine();
		if(a.equals("c")){
			score += 10;
		}	
		System.out.println("Question 2: \nWhich movie placed first on the Sight & Sound poll in 2022?");
		System.out.println("a) Vertigo\nb) Jeanne Dielman, 23 quai du Commerce, 1080 Bruxelles\n"
				+ "c) Citizen Kane\nd) Rules of the Game");
		String b = scan.nextLine();
		if(b.equals("b")) {
			score += 20;
		}
		System.out.println("Question 3: \nWho plays John Ford in The Fabelmans?");
		System.out.println("a) David Lynch\nb) Martin Scorsese\n"
				+ "c) Steven Spielberg\nd) George Lucas");
		String c = scan.nextLine();
		if(c.equals("a")) {
			score += 30;
		}
		System.out.println("Your Score is: "+score);
		performance(score);
		
	}
	public static void performance(int s) {
		if(s>=50) {
			System.out.println("Amazing!!!");
		}
		else if(s>=30) {
			System.out.println("Good");
		}
		else {
			System.out.println("Poor");
		}
	}
}

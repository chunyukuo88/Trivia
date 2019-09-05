package trivia;

import java.util.Scanner;

/*
 		*_* ¡Now with 5% more Spanish! *_*
 */
public class GithubTrivia {
	
	static Scanner input = new Scanner(System.in);
	static int correctAnswers = 0;
	static String celebrateCorrectness = "Huzzah! You get a point!";
	
	public static void getUserName() {
		while (true) {
			String userName = input.nextLine();

			if (userName.length() <= 0) { 
				System.out.println("We need a name, por favor.");	//This will keep printing as long as the user does not enter a name.
			} else if (userName.equalsIgnoreCase("Chuck Norris")) {
				System.out.println("Oh hi Chuck. Naturally, you know all the answers. "
						+ "But thanks for testing my crummy app!\n");
				break;
			}else {
				System.out.println("Hi, " + userName + ". Right then, to the quiz!");
				break;
			}
		}
	}
	
	public static void questionAsker1() {
		System.out.print("Question 1:\n" + GithubTriviaQuestions.question1('q') + "\n>"); 
		while (true) {
			String userAnswer1 = input.nextLine();
			//If the user's answer != the correct answer:
			if (userAnswer1.equalsIgnoreCase(GithubTriviaQuestions.question1('a')) != true)
				System.out.print("Try again:\n>");
			else {
				System.out.println(celebrateCorrectness);
				correctAnswers++;
				break;
			}
		}
	}
	
	public static void questionAsker2() {	//I copied questionAsker1 and just used CTRL+F (a linguist's best friend) to mass-replaced '1' to '2'. 
		System.out.print("Question 2:\n" + GithubTriviaQuestions.question2('q') + "\n>"); 
		while (true) {
			String userAnswer2 = input.nextLine();
			//If the user's answer != the correct answer:
			if (userAnswer2.equalsIgnoreCase(GithubTriviaQuestions.question2('a')) != true)
				System.out.print("Try again:\n>");
			else {
				System.out.println(celebrateCorrectness);
				correctAnswers++;
				break;
			}
		}
	}

	public static void questionAsker3() {
		System.out.print("Question 3:\n" + GithubTriviaQuestions.question3('q') + "\n>"); 
		while (true) {
			String userAnswer3 = input.nextLine();
			//If the user's answer != the correct answer:
			if (userAnswer3.equalsIgnoreCase(GithubTriviaQuestions.question3('a')) != true)
				System.out.print("Try again:\n>");
			else {
				System.out.println(celebrateCorrectness);
				correctAnswers++;
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Quiz time! Name please:\n>"); //Presumably Chuck Norris.
		getUserName();

		questionAsker1();	questionAsker2();	questionAsker3();
		
		if (correctAnswers < 3) {
			System.out.println("Thanks or playing!");
		} else {
			System.err.println("\n\nThanks for playing! You got " + correctAnswers + " correct!"); //The err is deliberate, because red is an auspicious color.
			System.err.println(GithubTriviaQuestions.mansBestFriend());
		}	
	}
}





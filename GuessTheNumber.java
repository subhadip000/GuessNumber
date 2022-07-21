import java.util.Random;
import java.util.Scanner;

//class name Game, which allows a user to play "Guess the Number"
class Game {
	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;

// getter and setter for noOfGuesses
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	public int getNoOfGuesses() {
		return noOfGuesses;
	}

//Constructor to generate the random number
	Game() {
		Random r = new Random();
		this.number = r.nextInt(100);
	}

//method to take a user input of number
	void takeUserInput() {
		System.out.print("Guesse the number: ");
		Scanner s = new Scanner(System.in);
		inputNumber = s.nextInt();
	}

//method to detect whether the number entered by the user is true
	boolean isCorrectNumber() {
		noOfGuesses++;
		if (inputNumber == number) {
			System.out.format("You guessed correct number: %d\nYou guessed it in %d attempts", number, noOfGuesses);
			return true;
		} else if (inputNumber < number) {
			System.out.println("Too low....");
		} else if (inputNumber > number) {
			System.out.println("Too high....");
		}
		return false;
	}
}

public class GuessTheNumber {
	public static void main(String[] args) {
		Game g = new Game();
		boolean b = false;
		while (!b) {
			g.takeUserInput();
			b = g.isCorrectNumber();
		}
	}
}
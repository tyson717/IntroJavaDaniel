package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_35_HangMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"write", "that", "pencil", "keyboard", "mouse", "computer"};
        char answer = 'y';
        while (answer == 'y') {
            int a = (int) (Math.random() * words.length);
            String word = words[a];
            char[] letters = word.toCharArray();
            char[] asterisk = new char[letters.length];
            for (int i = 0; i < asterisk.length; i++) {
                asterisk[i] = '*';
            }

            int countMissed = 0;
            int wordLetter = 0;
            while (wordLetter < word.length()) {
                System.out.println("(Guess) Enter a letter in word " + asterisk + ">");
                char guess = input.next().charAt(0);
                boolean isLetterAlreadyInTheWord = false;
                boolean isLetterNotIntheWord = true;
                for (int i = 0; i < letters.length; i++) {
                    if (guess == asterisk[i]) {
                        isLetterAlreadyInTheWord = true;
                        break;
                    }
                    if (guess == letters[i]) {
                        isLetterNotIntheWord = false;
                        wordLetter++;
                        asterisk[i] = guess;
                    }
                }
                if (isLetterAlreadyInTheWord) {
                    System.out.println(guess + " is already in the word");
                }
                if (isLetterNotIntheWord) {
                    countMissed++;
                    System.out.println(guess + " is not in the word");
                }
            }
                System.out.println("The word is \"" + word + "\". You missed " + countMissed + " time\n" +
                        "Do you want to guess another word? Enter y or n>");
                answer = input.next().charAt(0);
            }
            System.out.println("Have a nice day :)");
        }
    }

/*(Game: hangman) Write a hangman game that randomly generates
 a word and prompts the user to guess one letter at a time,
  as presented in the sample run. Each letter in the word is
   displayed as an asterisk. When the user makes a correct guess,
   the actual letter is then displayed. When the user finishes a word,
   display the number of misses and ask the user whether to continue to
   play with another word. Declare an array to store words, as follows:
          // Add any words you wish in this array
String[] words = {"write", "that",...};
*/
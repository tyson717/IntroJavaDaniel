import java.util.Scanner;

public class hangman {

    public static void main(String[] args) {
        String[] words = { "write", "that", "test", "love", "hate", "happy" };

        Scanner input = new Scanner(System.in);
        String ans;

        do {
            int i = intRandom(0, words.length - 1);
            char[] word = words[i].toCharArray();
            boolean[] mask = new boolean[word.length];
            int numberOfCorrectGuess = 0;
            int numberOfMisses = 0;
            while (numberOfCorrectGuess != word.length) {
                System.out.print("(Guess) Enter a letter in word ");

                // Print out result
                for (int j = 0; j < word.length; j++) {

                    if (mask[j])
                        System.out.print(word[j]);
                    else
                        System.out.print("*");

                }

                System.out.print(">");
                char guess = input.next().charAt(0);

                // Checking
                boolean miss = true;
                boolean repeat = false;

                for (int j = 0; j < word.length; j++) {
                    if (word[j] == guess) {
                        if (mask[j] != true) {
                            mask[j] = true;
                            numberOfCorrectGuess++;
                        } else {
                            repeat = true;
                            break;
                        }
                        miss = false;
                    }
                }

                if (miss)
                    numberOfMisses++;
                if (repeat)
                    System.out.println(guess + " is already in the word");

            }

            System.out.println("The word is " + String.valueOf(word)
                    + ". You missed " + numberOfMisses + " time");
            System.out
                    .print("Do you want to guess another word? Enter y or n>");
            ans = input.next();
        } while (ans.charAt(0) != 'n');

    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

}
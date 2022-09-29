package chapter3;

import java.util.Scanner;

public class GameLottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three digit number : ");
        int guess = input.nextInt();
        while (guess>999){
            System.err.println("Invalid Entry. Please re-entry. Enter three-digit Number: ");
            guess = input.nextInt();
        }


        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 100;

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess % 100;

        if (guess == lottery) {
            System.out.println("Lottery number: " + lottery + "\nGuessing Number : " + guess + "\nExact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2
                && guessDigit1 == lotteryDigit3
                && guessDigit2 == lotteryDigit3) {
            System.out.println("Lottery number: " + lottery + "\nGuessing Number : " + guess + "\nMatch all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit3) {
            System.out.println("Lottery number: " + lottery + "\nGuessing Number : " + guess + "\nMatch one digit: you win $1,000");
        } else {
            System.out.println("Lottery number: " + lottery + "\nGuessing Number : " + guess);
            System.out.println("Sorry, no match");
        }
    }
}
/*(Game: lottery) Revise Listing 3.8, Lottery.java,
to generate a lottery of a three-digit number.
The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $12,000.
2. If all digits in the user input match all digits in the lottery number, the award is $5,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $2,000.*/
package chapter5;

public class DisplayPattern {
    public static void main(String[] args) {
        System.out.println("Pattern A: ");
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int rows = 0; rows < 6; rows++) {                // Print rows
            for (int ws = 0; ws < rows; ws++) {                // Print white space
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - rows; col++) {    // Print numbers
                System.out.print((col + 1) + " ");
            }
            System.out.println();
        }
    }
}
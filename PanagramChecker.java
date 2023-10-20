//3. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z).

import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase(); // Convert the sentence to lowercase for case-insensitivity

        // Create a boolean array to mark the presence of each letter from 'a' to 'z'
        boolean[] alphabetPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Calculate the index of the letter in the array
                int index = c - 'a';
                // Mark the presence of the letter in the array
                alphabetPresent[index] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false; // If any letter is not present, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        scanner.close();

        if (isPangram(inputSentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

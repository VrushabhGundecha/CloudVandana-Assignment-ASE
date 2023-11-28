package CloudVandanaAssignment;

import java.util.Scanner;

public class panagramCheck {

	private static final int ALPHABET_SIZE = 26;

    private static boolean isPangram(String sentence) {
    	
        // to track the occurrence of each letter in the alphabet
        boolean[] alphabetCheck = new boolean[ALPHABET_SIZE];

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (Character.isLetter(currentChar)) {
            	
                // Convert the letter to lowercase and calculate its index in the alphabet
                int index = Character.toLowerCase(currentChar) - 'a';

                // Mark the corresponding index as true to indicate the presence of the letter
                alphabetCheck[index] = true;
            }
        }

        // Check if all letters from a to z are present
        for (boolean letterPresent : alphabetCheck) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = isPangram(sentence);
        if(isPangram)
        	System.out.println("Sentence is Pangram");
        else
        	System.out.println("Sentence is not Pangram");
    }

}

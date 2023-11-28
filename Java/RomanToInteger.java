package CloudVandanaAssignment;

import java.util.Scanner;

public class RomanToInteger {
	
	private static int romanToInteger(String romanNumeral) {
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (i + 1 < romanNumeral.length()) {
                char nextChar = romanNumeral.charAt(i + 1);
                int nextValue = romanCharToInt(nextChar);

                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++; 
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private static int romanCharToInt(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }

}

/**
* Week 2 : Assignment - 1
* When the program is run, the user will first enter a string or a number.
* After that, the program should ask the user which operation they want to execute,
* The available operations are listed below: 
* Task 1: Valid Parentheses Combination Generator
* Task 2: Digit Sum Loop(String)
* Task 3: Consecutive Number Summer
* Task 4: Caesar Cipher with Shift Variability
* Task 5: Encoding Challenge with ASCII Conversion
* based on the user's input.
* @author Tushar Pareek
* @since  10/09/2024
*/
import java.util.Scanner;

public class Week2Assignment1 {
    public static Week2Assignment1_Strings Statements= new Week2Assignment1_Strings();
    public static Scanner scan = new Scanner(System.in);
    
    // Task 1 - Valid Parentheses Combination Generator
    public static void substringGenerator(String s){

    }
    // Task 2: Digit Sum Loop(String)
    public static void digitSum(int s){        
        while(s>9){
            int sum = 0;
            while(s>0){
                sum += s % 10;
                s = s / 10;
            }
            s = sum;}
            System.out.println(Statements.output2 + s);
    }
    // Task 3: Consecutive Number Summer
    public static void findConsecutiveSumSequences(int N) {
        boolean found = false;
        for (int k = 2; k * (k - 1) / 2 < N; k++) {
            int numerator = N - (k * (k - 1) / 2);
            if (numerator % k == 0) {
                int a = numerator / k;
                if (a > 0) {
                    printSequence(a, k);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No sequence found");
        }
    }

    private static void printSequence(int start, int length) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sequence.append(" + ");
            }
            sequence.append(start + i);
        }
        System.out.println(sequence + " = " + (start * length + (length * (length - 1) / 2)));
    }

    // Task 4: Caesar Cipher with Shift Variability
    public static void caesarCipher(String input, int[] shiftPattern) {
        int patternLength = shiftPattern.length;
        String result = "";
        for (int i = 0, patternIndex = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ') {
                int shift = shiftPattern[patternIndex % patternLength];
                char shiftedChar = (char) (currentChar + shift);
                result += shiftedChar;
                patternIndex++;
            } else {
                result += ' '; 
            }
        }
        System.out.println("Encrypted Text: " + result);
    }
    //Task 5: Encoding Challenge with ASCII Conversion
    public static void asciiConverter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array of digits (e.g., 2315): ");
        String arrayInput = sc.nextLine();
        System.out.print("Enter the series of integers (e.g., 123): ");
        String seriesInput = sc.nextLine();
        char[] digits = arrayInput.toCharArray();
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        String result = "";
        for (int i = 0; i < seriesInput.length(); i++) {
            char seriesChar = seriesInput.charAt(i);
            int index = Character.getNumericValue(seriesChar) - 1; 
            if (index >= 0 && index < digits.length) {
                char digitChar = digits[index];

                result += digitChar;
            }
        }
        
        
        System.out.println("Output: " + result);

        }
        // Main method
    public static void main(String[] args) {
        while (true) {
        System.out.println(Statements.userQuestion);
        System.out.println(Statements.options);
        int operation = scan.nextInt();
        switch (operation) {
            case 1:
            System.out.println(Statements.enterString);
            String input = scan.nextLine();
            substringGenerator(input); 
                break;
            case 2:
            System.out.println(Statements.enterInteger);
            int inputint = scan.nextInt();
            digitSum(inputint);
                break;
            case 3:
            System.out.println(Statements.enterInteger);
            int number = scan.nextInt();
            System.out.println(Statements.output3);
            findConsecutiveSumSequences(number);
                break;
            case 4:
            Scanner sc = new Scanner(System.in);
            System.out.println(Statements.enterString);
            String input4 = sc.nextLine();
            System.out.println(Statements.inputprompt4);
            String shiftPattern = sc.nextLine();
            int length = shiftPattern.length();
            int[] arrayOfNumbers = new int[length];
            for(int i = 0 ; i < length ; i++){
                arrayOfNumbers[i] = Character.getNumericValue(shiftPattern.charAt(i));
            }
            caesarCipher(input4 , arrayOfNumbers);
                break;
            case 5:
        

            asciiConverter();
                break;
            }   
            System.out.println(Statements.againStatement);
            int choice = scan.nextInt();
            if(choice == 1){
                continue;
            }
            else{
                break;
            }  
    }

}
}

    
  


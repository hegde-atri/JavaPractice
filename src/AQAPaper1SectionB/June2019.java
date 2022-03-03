package AQAPaper1SectionB;

import java.util.Scanner;

/*
Write a program that gets two words from the user and then displays a message
saying if the first word can be created using the letters from the second word or not.
For example:
    • The word EAT can be formed from the word ATE as the first word uses one E, one
    A and one T and the second word also contains one of each of these letters.
    • The word EAT can be formed from the word HEART as the second word contains
    one E, one A and one T which are the letters needed to form the first word.
    • The word TO can be formed from the word POSITION as the second word contains
    one T and (at least) one O which are the letters needed to form the first word.
    • The word MEET cannot be formed from the word MEAT as the second word only
    contains one E and two Es are needed to form the first word.
You may assume that the user will only enter words that consist of upper case letters.
 */
public class June2019 {
    // Time taken 8min 24s
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter first word: ");
            String fWord = scanner.next();
            System.out.print("Enter second word: ");
            String sWord= scanner.next();

            char[] fWordArray = fWord.toCharArray();
            char[] sWordArray = sWord.toCharArray();
            boolean isValid = false;
            int count = 0;

            for(char x: fWordArray){
                for(int i=0; i< sWordArray.length; i++){
                    if(x == sWordArray[i]){
                        sWordArray[i] = ' ';
                        count++;
                        break;
                    }
                }
            }
            if(count == fWord.length()) isValid = true;

            if(isValid){
                System.out.println("Word " + fWord + " can be formed from " + sWord);
            }else{
                System.out.println("Word " + fWord + " cannot be formed from " + sWord);
            }
        }
    }
}

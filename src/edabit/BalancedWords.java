package edabit;
/*
We can assign a value to each character in a word, based on their position in the alphabet (a = 1, b = 2, ... , z = 26).
A balanced word is one where the sum of values on the left-hand side of the word equals the sum of values on the right-hand side.
For odd length words, the middle character (balance point) is ignored.

Write a function that returns true if the word is balanced, and false if it's not.
 */


import java.util.Scanner;

public class BalancedWords {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter word: ");
            char[] input = scanner.next().toCharArray();
            String left = "";
            String right = "";
            int leftSum;
            int rightSum;

            if(input.length % 2 == 0){
                for(int i = 0; i < input.length/2; i ++){
                    left += input[i];
                }
                for(int i = input.length/2; i<input.length; i++){
                    right += input[i];
                }

            }else{
                for(int i = 0; i < input.length/2; i ++){
                    left += input[i];
                }
                for(int i = (input.length/2)+1; i<input.length; i++){
                    right += input[i];
                }
            }

            rightSum = getSum(right.toCharArray());
            leftSum = getSum(left.toCharArray());

            if(rightSum == leftSum){
                System.out.println("True, the word is balanced.");
            }else{
                System.out.println("False. The word is not balanced.");
            }


            System.out.print("Want to continue? (y/n):  ");
            if(scanner.next().equals("n")) break;
        }
    }

    public static int getSum(char[] arr){
        int total = 0;
        for(char x: arr){
            total += getValue(x);
        }
        return total;
    }

    public static int getValue(char x){
        return ((int)x - 96);
    }
}

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
            System.out.print("");


            System.out.print("Want to continue? (y/n):  ");
            if(scanner.next().equals("n")) break;
        }
    }

    public static int getSum(){
        return 0;
    };
}

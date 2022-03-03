package edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given a string, reverse all the words which have odd length. The even length words are not changed.
 */
public class ReverseOddLength {

    public static void main() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the string:  ");
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");


            for(int i = 0; i< inputArray.length; i++){
                if(!(inputArray[i].length() % 2 == 0)){
                    char[] toReverseArr = inputArray[i].toCharArray();
                    StringBuilder reversed = new StringBuilder();
                    for(int x= toReverseArr.length-1; x >= 0; x--){
                        reversed.append(toReverseArr[x]);
                    }
                    inputArray[i] = reversed.toString();
                }
            }
            System.out.println(Arrays.toString(inputArray));

            System.out.print("wanna quit: (y/n) ");
            if (scanner.nextLine().equals("y")) break;

        }
    }

}

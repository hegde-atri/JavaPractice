package powerpoint;
/*
lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry,
that was supposed to say: Please help me unmix these strings!
Somehow my strings have all become mixed up;
every pair of characters has been swapped
Help me undo this so I can understand my strings
again. unmix("123456") ➞ "214365"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter input:");
            String input = scanner.nextLine();
            char[] inputArr = input.toCharArray();

            for(int i = 0; i<inputArr.length; i+=2){
                if(!(i + 2 > inputArr.length)){
                    char temp = inputArr[i];
                    inputArr[i] = inputArr[i+1];
                    inputArr[i+1] = temp;
                }else{
                    break;
                }
            }
            System.out.println(inputArr);




            System.out.print("do you want to quit (y/n): ");
            if(scanner.nextLine().equals("y")) break;



        }
    }

}

package powerpoint;

import java.util.Scanner;

/*
Create a function that takes an array of increasing
letters and return the missing letters.
E.g.
Input: vbcefmghijklnoud
Output: apqrstwxyz
The order of the letters being input or output does
not have to be alphabetical.
 */
public class Question1 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter text: ");
            char[] input = scanner.nextLine().toCharArray();
            String output = "";
            for(char i = 'a'; i <= 'z'; i++){
                if(!hasChar(input, i)) output += i;
            }
            System.out.println(output);

            System.out.print("do you want to quit (y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static boolean hasChar(char[] arr, char target){
        for (char c : arr) {
            if (c == target) return true;
        }
        return false;
    }

}

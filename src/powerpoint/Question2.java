package powerpoint;
/*
Create a function that reverses letters in a string but
keeps digits in their current order. reverse("ab89c") ➞ "cb89a"

reverse("jkl5mn923o") ➞ "onm5lk923j"

reverse("123a45") ➞ "123a45"
 */

import java.util.Scanner;

public class Question2 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter text: ");
            char[] input = scanner.next().toCharArray();
            char[] alphaInput = getAlpha(input);
            int count = 0;
            for(int i = input.length-1; i >= 0; i--){
                if(Character.isAlphabetic(input[i])){
                    input[i] = alphaInput[count];
                    count++;
                }
            }

            System.out.println(input);

            System.out.print("do you want to quit (y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static char[] getAlpha(char[] arr){
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (Character.isAlphabetic(c)) sb.append(c);
        }
        return sb.toString().toCharArray();
    }
}

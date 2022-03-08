package powerpoint;

import java.util.*;

/*
Create a function that takes in a sentence as input and returns
the most common last vowel in the sentence.
“Hello World!” ➞ ‘o’
“Watch the characters dance!” ➞ ‘e’
“OOI UUI EEI AAI” ➞ ‘I’

Notes
• There will only be one common last vowel in each sentence.
• The question asks you to compile all of the last vowels of each
word and returns the vowel in the list which appears most often.
• Case does not matter in this question
 */
public class Question4 {
    public final static char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static void main(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter text: ");
            String[] input = scanner.nextLine().split(" ");

            ArrayList<Character> tempOutput = new ArrayList<>();

            for(String x: input){
                tempOutput.add(getLastVowel(x));
            }

            char output = ' ';
            int freq = 0;

            for(char x: VOWELS){
                int temp = Collections.frequency(tempOutput, x);
                if(freq < temp){
                    freq = temp;
                    output = x;
                }
            }


            if(output == ' '){
                System.out.println("There were no vowels");
            }else {
                System.out.println("The most common last vowel in the sentence: " + output);
            }



            System.out.print("do you want to quit (y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static char getLastVowel(String input){
        char[] inputArr = input.toLowerCase().toCharArray();
        char lastVowel = ' ';
        for(char x: inputArr){
            for(char i: VOWELS){
                lastVowel = x;
            }
        }
        return lastVowel;
    }


}

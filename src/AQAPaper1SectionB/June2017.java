package AQAPaper1SectionB;
/*
One method that can be used to compress text data is run length encoding
(RLE). When RLE is used the compressed data can be represented as a set of
character/frequency pairs. When the same character appears in consecutive
locations in the original text it is replaced in the compressed text by a single
instance of the character followed by a number indicating the number of
consecutive instances of that character. Single instances of a character are
represented by the character followed by the number 1
 */

import java.util.Scanner;

public class June2017 {
    // 6 min 15sec
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter text: ");
            String userInput = scanner.next();
            char[] userinputArray = userInput.toCharArray();
            String compressed = "";

            for(int i=0; i< userinputArray.length; i++){
                int count = 0;
                for(int x = i; x< userinputArray.length; x++){
                    if(userinputArray[i] != userinputArray[x]){
                        i = x - 1;
                        break;
                    }else{
                        if(userinputArray.length-1 == x){
                            i = x;
                            count++;
                            break;
                        }
                        count++;
                    }
                }
                compressed += userinputArray[i]+ "" + count;
            }
            System.out.println(compressed);

            System.out.print("Do want to try again (y/n): ");
            if(scanner.next().equals("n")) break;
        }
    }
}

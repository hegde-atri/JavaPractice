package AQAPaper1SectionB;

import java.util.Scanner;

/*
Write a program that asks the user how many numeric digits they would like to enter
and then gets the user to enter that number of numeric digits.
The program should calculate and display the number of times the most frequently
entered numeric digit was input.
If more than one numeric digit had the same frequency and was the most frequently
entered then instead of displaying the frequency, a message saying "Data was
multimodal" should be displayed.
A numeric digit is 0, 1, 2, 3, 4, 5, 6, 7, 8 or 9
You may assume that the number that the user enters to state how many numeric
digits there will be and the numeric digits entered by the user are all valid.
 */
public class June2020 {
    // 23 min lmao
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int modalLocation;
            int size = -1;

            while(size < 0){
                System.out.print("How many digits do you wanna enter: ");
                size = scanner.nextInt();
            }

            int[] numList = new int[size];
            int[] frequency = new int[size];

            for(int i=0; i<size; i++){
                System.out.print("Enter digit: ");
                numList[i] = scanner.nextInt();
            }

            for(int i=0; i<size; i++){
                int count = 0;
                for(int x=0; x<size; x++){
                    if(numList[x] == numList[i]){
                        count++;
                    }
                }
                frequency[i] = count;
            }

            modalLocation = 0;
            int highestFrequency = 0;
            for(int i=0; i<numList.length; i++){
                if(frequency[i] == highestFrequency && numList[i] == numList[modalLocation]){

                }else if(frequency[i] == highestFrequency){
                    modalLocation = -1;
                    break;
                }else if(frequency[i] > highestFrequency){
                    modalLocation = i;
                    highestFrequency = frequency[i];
                }
            }

            if(modalLocation == -1){
                System.out.println("It is multimodal");
            }else{
                System.out.println("Mode: " + numList[modalLocation] + "\nFrequency: " + highestFrequency);
            }


            System.out.print("wanna quit: (y/n) ");
            if(scanner.next().equals("y")) break;
        }
    }
}

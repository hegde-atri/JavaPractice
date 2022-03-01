package SectionB;
/*      Write a program that checks which numbers from a series of numbers entered
        by the user are prime numbers.

        The program should get a number from the user and then display the messages:
        • "Not greater than 1" if the number entered is 1 or less
        • "Is prime" if the number entered is a prime number
        • "Is not prime" otherwise.

        The user should then be asked if they want to enter another number and the program
        should repeat if they say that they do.
        A prime number is a positive integer that will leave a remainder if it is divided by any
        positive integer other than 1 and itself.
        You may assume that each number entered by the user is an integer.
        If your program only works correctly for some prime numbers you will get some marks
        for this question. To get full marks for this question, your program must work correctly
        for any valid integer value that the user enters.
*/

import java.util.Scanner;

public class June2018 {
    // Time taken 6 min
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            if(!(input < 1)){
                int factors = 0;
                for(int i = 1; i<input; i++){
                    if(input % i == 0){
                        factors++;
                    }
                }
                if(factors > 1){
                    System.out.println("Number is not prime.");
                }else{
                    System.out.println("Number is prime.");
                }
            }else{
                System.out.println("Number must be greater than one.");
            }


            System.out.print("Do want to try again (y/n): ");
            if(scanner.next() == "n"){
                break;
            }

        }

    }

}

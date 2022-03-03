package edabit;
/*
Create a function that finds how many prime numbers there are, up to the given integer.
 */

import java.util.Scanner;

public class HowManyPrimeNum {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int prime_nums = 0;
            System.out.print("Enter your number:");
            int userInput = scanner.nextInt();

            for(int i=0; i<userInput; i++){
                if(isPrime(i)){
                    prime_nums++;
                }
            }

            System.out.println("There are " + prime_nums + " prime numbers.");


            System.out.print("Want to continue? (y/n):  ");
            if(scanner.next().equals("n")) break;
        }
    }

    public static boolean isPrime(int num){
        int count = 0;
        if(num == 0) return false;
        if(num == 1) return false;
        for(int i = 1; i<num; i++){
            if(num % i == 0){
                count ++;
            }
        }
        return !(count > 1);

    }
}

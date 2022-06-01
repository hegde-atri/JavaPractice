package edabit;

import java.util.ArrayList;
import java.util.Scanner;

/*
There's a great war between the even and odd numbers.
Many numbers already lost their lives in this war and it's your task to end this.
You have to determine which group sums larger: the evens, or the odds.
The larger group wins.

Create a function that takes an array of integers, sums the even and odd numbers separately,
then returns the difference between the sum of the even and odd numbers.
 */
public class WarOfNumbers {
    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many numbers in array: ");
            int n = scanner.nextInt();
            int[] iArray = new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter num: ");
                iArray[i] = scanner.nextInt();
            }

            System.out.println("Result of war: " + war(iArray));

            System.out.print("wanna quit(y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static int war(int[] arr){
        ArrayList<Integer> evenNum = new ArrayList<>();
        int evenSum = 0;
        ArrayList<Integer> oddNum = new ArrayList<>();
        int oddSum = 0;
        for(int x: arr){
            if(x % 2 == 0){
                evenNum.add(x);
            }else{
                oddNum.add(x);
            }
        }
        for(int x: evenNum){
            evenSum += x;
        }
        for(int x: oddNum){
            oddSum += x;
        }
        return evenSum-oddSum;
    }
}

package edabit;

import java.util.Scanner;

public class HarshedNumber {
    // A number is said to be Harshad if it's exactly divisible by the sum of its digits.
    // Create a function that determines whether a number is a Harshad or not.
    // You are expected to solve this challenge via recursion.


    public static void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Type in a number: ");
            int input = scanner.nextInt();
            System.out.println("Harshed number: " + isHarshed(input));

            System.out.print("wanna quit (y/n)");
            if(scanner.next().equals("y")) break;
        }

    }

    public static int sumOfDigits(int num, int sum){
        String temp = Integer.toString(num);
        sum += Integer.parseInt(temp.substring(0, 1));

        if(!(temp.substring(1).equals(""))){
            num = Integer.parseInt(temp.substring(1));
        }else{
            return sum;
        }
        return sumOfDigits(num, sum);
    }

    public static boolean isHarshed(int num){
        return (num % sumOfDigits(num, 0) == 0);
    }

}

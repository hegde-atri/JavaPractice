package leetcode;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 */

import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter num: ");
            int input = scanner.nextInt();
            System.out.println("reversed: " + reverse(input));


            System.out.print("wanna quit(y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static int reverse(int x) {
        boolean neg = false;
        if(x < 0){
            neg = true;
            x *= -1;
        }
        Stack stack = new Stack();
        for(char i: String.valueOf(x).toCharArray()){
            stack.push(i);
        }
        char[] reversedArr = new char[String.valueOf(x).length()];
        int count = 0;
        for(char i: String.valueOf(x).toCharArray()){
            reversedArr[count] = (char) stack.peek();
            count++;
            stack.pop();
        }
        int reversed = 0;
        try{
            reversed = Integer.parseInt(String.valueOf(reversedArr));
            if(neg) return reversed * -1;
            return reversed;
        }catch(Exception e){
            return reversed;
        }
    }
}

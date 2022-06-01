package leetcode;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

 */

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            System.out.print("How many brackets in array: ");
            int n = scanner.nextInt();
            for(int i=0; i<n; i++){
                System.out.print("Enter bracket: ");
                sb.append(scanner.nextLine().charAt(0));
            }

            System.out.println("is valid: " + isValid(sb.toString()));

            System.out.print("wanna quit(y/n): ");
            if(scanner.next().equals("y")) break;
        }

    }

    public static boolean isValid(String s) {
        // make stack, add and remove items from stack, if stack is empty at the end, then return true.
        Stack<Character> stack = new Stack<>();
        for(char x: s.toCharArray()){
            switch(x){
                case('('):
                    stack.add('(');
                    break;
                case(')'):
                    if(stack.isEmpty()) return false;
                    if(stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case('['):
                    stack.add('[');
                    break;
                case(']'):
                    if(stack.isEmpty()) return false;
                    if(stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case('{'):
                    stack.add('{');
                    break;
                case('}'):
                    if(stack.isEmpty()) return false;
                    if(stack.peek() != '{') return false;
                    stack.pop();
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();

    }

}

package edabit;

public class HarshedNumber {
    // A number is said to be Harshad if it's exactly divisible by the sum of its digits.
    // Create a function that determines whether a number is a Harshad or not.
    // You are expected to solve this challenge via recursion.

    //TODO

    public static void main(){
        int x = 171;
        int sum = sumOfDigits(x, 0);
        System.out.println("");
    }

    public static int sumOfDigits(int num, int sum){
        String temp = String.valueOf(num);

        int first = temp.charAt(0);

        temp.replaceFirst(String.valueOf(first), "");

        int newNum = Integer.parseInt(temp);

        int totalSum = sumOfDigits(newNum, sum+first);

        return totalSum;
    }

}

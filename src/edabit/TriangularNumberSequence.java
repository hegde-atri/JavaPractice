package edabit;

/*
This Triangular Number Sequence is generated from a pattern of dots that form a triangle.
The first 5 numbers of the sequence, or dots, are: 1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.
Write a function that returns the number of dots when given its corresponding triangle number of the sequence.
 */

import java.util.Scanner;

public class TriangularNumberSequence {
    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter triangle number: ");

            int input = scanner.nextInt();
            System.out.println("triangle("+input+") --> " + triangleNumber(input));

            System.out.print("wanna quit: (y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static int triangleNumber(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        return sum;
    }

}

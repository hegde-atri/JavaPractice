package edabit;
/*
Create a function that checks if a given integer is exactly the factorial of an integer or not.
true if it is, false otherwise.
*/

import java.util.Scanner;

public class IsFactorial {
    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter integer ");
            int num = scanner.nextInt();



            System.out.print("wanna quit(y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static boolean isFactorial(int num){
        int count = 1;
        while(true){
            if(num % count == 0){
                num /= count;
                count ++;
            }else{
                break;
            }
        }
        return num == 1;
    }
}

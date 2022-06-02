package edabit;

import java.util.Scanner;

/*
Create a function that takes an array of numbers and return "Boom!"
if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
 */
public class SevenBoom {
    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter integer ");
            int num = scanner.nextInt();



            System.out.print("wanna quit(y/n): ");
            if(scanner.next().equals("y")) break;
        }
    }
    public static String sevenBoom(int[] arr) {
        for (int x : arr) {
            if (x == 7 || x == -7) {
                return "Boom!";
            }
            if (x > 9) {
                String i = Integer.toString(x);
                for (char p : i.toCharArray()) {
                    if (Integer.parseInt(String.valueOf(p)) == 7) {
                        return "Boom!";
                    }
                }
            }
            if (x < 0) {
                x *= -1;
                String i = Integer.toString(x);
                for (char p : i.toCharArray()) {
                    if (Integer.parseInt(String.valueOf(p)) == 7) {
                        return "Boom!";
                    }
                }
            }
        }
        return "there is no 7 in the array";
    }

}

package edabit;
/*
John wants to save money for his first car. He puts money in his piggy bank every day. Every day, he puts in $1 more than the previous day. Every Monday he starts with a new value ⁠— $1 more than the previous Monday.
Week 1 (starting at $1)

Day	Amount	Sum
Monday	    $1	$1
Tuesday	    $2	$3
Wednesday	$3	$6
Thursday	$4	$10
Friday	    $5	$15
Saturday	$6	$21
Sunday	    $7	$28

Week 2
Day	Amount	Sum
Monday	    $2	$30
Tuesday	    $3	$33
Wednesday	$4	$37

etc ...

Write a function that returns the number of days he needs to buy his first car cost. John had some savings (include it before counting). On the first Monday, he puts the start amount into his piggy bank.
Examples

Challenge.NumberOfDays(2050, 1200, 10) ➞ 53
// 2050: cost of car, 1200: savings, 10: start amount
// After 53 days he can buy a car.

Challenge.NumberOfDays(10000, 2500, 50) ➞ 123
// After 123 days he can buy a car.

Challenge.NumberOfDays(500, 300, 50) ➞ 4
// After 4 days he can buy a car.

The first day is always Monday.
To buy a car, he needs money greater than or equal to cost.
All given numbers will be greater than 0.
BONUS: Try not adding the sum every day!
 */

import java.util.Scanner;

public class PiggyBank {
    public static void main() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter cost: ");
            int cost = scanner.nextInt();
            System.out.print("Enter savings: ");
            int savings = scanner.nextInt();
            System.out.print("Enter start amount: ");
            int start = scanner.nextInt();

            System.out.println("Number of days: " + numberOfDays(cost, savings, start));

            System.out.print("wanna quit(y/n) ");
            if(scanner.next().equals("y")) break;
        }
    }

    public static int numberOfDays(int cost, int savings, int start) {
        int sum = 0;
        int days = 0;
        int initial = start;
        int deposit = start;
        while((savings + sum) <=cost){
            // reset the day of the week to one
            int dayOfWeek = 1;
            // loops through 7 days in the week
            while((savings + sum) <=cost && dayOfWeek <=7){
                // add today's deposit to the sum
                sum += deposit;
                // increase the deposit by one for the next day
                deposit+=1;
                // increment the day counter
                days+=1;
                // increment the day of the week counter
                dayOfWeek ++;
            }
            // increment our start value on the "monday"
            initial += 1;
            // reset the depositing value to what we deposit on monday
            deposit = initial;
        }
        // return days taken
        return days;
    }
}

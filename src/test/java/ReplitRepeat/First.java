package ReplitRepeat;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter item and price : ");
        String firstItem = scan.next();
        int firstItemPrice = scan.nextInt();
        System.out.println("Would you want to continue? Yes or No ");
        String answer = scan.next();
        for (int i = 0; i <= 10; i++) {
            if (answer.equalsIgnoreCase("Yes")){
                System.out.println("Please enter item and price : ");
                firstItem = scan.next();
                firstItemPrice = scan.nextInt();
            }else{
                System.out.println("Thank you for your list");

            }

        }

        }
}
/*
//        In this assignment, you will write a program that will generate a shopping list.
          It's more advanced version of assignment Shopping list I.

//        Your program should ask use to enter items followed by its price. After adding item,  ask user if he wants to add one more item.
//        If so, repeat previous steps again. If no, print shopping list report and total price as show in examples.
//        Your program should accept up to 10 items.
//
//        Hint: use do while loop.
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	List<Integer> winningNumbers = new ArrayList<>();

	Random random = new Random();

	for(int i = 0;i<6;i++){
	    while(true){
	        int winningNumber = random.nextInt(49)+1;
	        if(!winningNumbers.contains(winningNumber)){
	            winningNumbers.add(winningNumber);
	            break;
            }
        }
    }

        System.out.println("Please enter your 6 numbers between 1 and 49(inclusive)");
    Scanner scanner = new Scanner(System.in);
	List<Integer> guessedNumbers =  new ArrayList<>();

	for(int i=0;i<6;i++) {
        System.out.println("Your current Numbers are " + guessedNumbers);
        System.out.println("Please enter a number (1-49):");
        while (true) {
            try {
                String numberString = scanner.nextLine();
                int number = Integer.parseInt(numberString);
                if (number >= 1 && number <= 49) {
                    guessedNumbers.add(number);
                    break;
                } else {
                    System.out.println(number + " is not between 1 &49. Please try again");

                }
            } catch (NumberFormatException nfe) {
                System.out.println("Bro, that's not even a number . Please try again");
            }
        }
    }

        System.out.println("The winning numbers were :"+winningNumbers);
        System.out.println("Your Numbers are :"+guessedNumbers);

        guessedNumbers.retainAll(winningNumbers);
        System.out.println("Your matched numbers are :"+guessedNumbers);

        if(guessedNumbers.retainAll(winningNumbers)){
            System.out.println("You won the LOttery , BINGO Congratulations ");
        }else{
            System.out.println("Sorry , You Lost ");

        }
        scanner.close();
    }
}

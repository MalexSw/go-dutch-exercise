package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
         Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int amOfGuests = scanner.nextInt();
        if (input < 0) {
           System.out.println("Bill total amount cannot be negative");
        } else if (amOfGuests <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            System.out.println((int)(input + input * 0.1) / amOfGuests);
        }
    }

}

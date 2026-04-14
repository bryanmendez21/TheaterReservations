package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class theater_reservations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your full name: ");
        String fullName = userInput.nextLine();

        System.out.print("Date of show: ");
        String date = userInput.nextLine();
        LocalDate dateReserved = LocalDate.parse(date);
        System.out.println(date);

        System.out.print("Number of tickets: ");
        int ticketQuantity = userInput.nextInt();

      //  System.out.printf("%f tickets Reserved for",ticketQuantity);


    }
}

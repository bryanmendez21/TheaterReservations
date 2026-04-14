package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class theaterReservations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your full name: ");
        String fullName = userInput.nextLine();
        String[] splitName = fullName.split(Pattern.quote(" "));
        String firstName = splitName[0];
        String lastName = splitName[1];

        System.out.print("Date of show write it in this format(DD-MM-YYYY): ");
        String date = userInput.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateReserved = LocalDate.parse(date,format);

        System.out.print("Number of tickets: ");
        int ticketQuantity = userInput.nextInt();

        if (ticketQuantity == 1) {
            System.out.printf("%d ticket Reserved for - under %s, %s", ticketQuantity, lastName, firstName);
        } else{
            System.out.printf("%d tickets Reserved for %tF under %s, %s", ticketQuantity,dateReserved, lastName, firstName);
        }

    }
}

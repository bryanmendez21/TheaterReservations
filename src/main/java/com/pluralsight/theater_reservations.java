package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class theater_reservations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your full name: ");
        String fullName = userInput.nextLine();
        String[] splitName = fullName.split(Pattern.quote(" "));
        String firstName = splitName[0];
        String lastName = splitName[1];

        System.out.print("Date of show: ");
        String date = userInput.nextLine();
        LocalDate dateReserved = LocalDate.parse(date);
        System.out.println(date);

        System.out.print("Number of tickets: ");
        int ticketQuantity = userInput.nextInt();

        System.out.printf("%d tickets Reserved for - under %s, %s",ticketQuantity,lastName,firstName);


    }
}

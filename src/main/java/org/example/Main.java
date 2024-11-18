package org.example;

import org.example.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Please enter your address");
        String address=scan.nextLine();
        System.out.println("Please enter your phone");
        String phone=scan.nextLine();
        System.out.println("Please enter your Customer Number");
        String custNum=scan.nextLine();
        System.out.println("Do you want to be on the mailing list?");
        boolean list=scan.hasNextBoolean();

        Customer newCust=new Customer(name,address,phone,custNum,list);
        System.out.println("You entered " + newCust.toString());
        //part 2
        PreferredCustomer preferredCustomer2 = new PreferredCustomer();
        preferredCustomer2.setName("Paul");
        preferredCustomer2.setAddress("ATU");
        preferredCustomer2.setPhone("091 775678");
        preferredCustomer2.setCustNumber("1002");
        preferredCustomer2.setMailingList(false);
        preferredCustomer2.setLoyaltyPoints(200); // Accumulate points
        System.out.println(preferredCustomer2);
        preferredCustomer2.setLoyaltyPoints(800); // Accumulate more points
        System.out.println(preferredCustomer2);


    }
}


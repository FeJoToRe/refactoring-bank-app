package com;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String name = input.next();
        System.out.println("Ingrese su ID");

        String customerId = input.next();

        Client client = new Client(name, customerId);
        Account account = new Account();

        Bank bank = new Bank(client, account);
        bank.menu();

        input.close();

    }

}

package com.company;

import javafx.scene.web.HTMLEditorSkin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BankAccount account = new BankAccount();
        Map<Integer, BankAccount> accounts = new HashMap<>();
        String line = reader.readLine();

        while (!"End".equals(line)) {
            String[] commandArgs = line.split(" ");

            int id = Integer.parseInt(commandArgs[1]);
            switch (commandArgs[0]) {
                case "Create":
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        BankAccount ba = new BankAccount();
                        ba.setId(id);
                        accounts.put(id, ba);
                    }
                    break;
                case "Deposit":
                    double depositamount = Double.parseDouble(commandArgs[2]);
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                        break;
                    }
                    accounts.get(id).deposit(depositamount);

                    break;
                case "Withdraw":
                    //Insufficient balance
                    double withdrawamount = Double.parseDouble(commandArgs[2]);

                    BankAccount acc = accounts.get(id);
                    if(acc!= null){
                        if (acc.getBalance() < withdrawamount)
                        {
                            System.out.println("Insufficient balance");
                        }else{
                            acc.withdraw(withdrawamount);
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "Print":
                   if(accounts.get(id) == null){
                       System.out.println("Account does not exist");
                       break;
                   }
                    System.out.println(accounts.get(id));
            }
            line = reader.readLine();
        }

    }
}

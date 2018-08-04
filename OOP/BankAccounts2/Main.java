package bankacc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!"End".equals(line = reader.readLine())) {
            String[] comandArgs;
            comandArgs = line.split(" ");

            Map<Integer,BankAccount> accounts = new HashMap<>();

            switch (comandArgs[0]) {
                case "Create":
                    BankAccount acc = new BankAccount();
                    accounts.put(acc.getId(),acc);
                    System.out.println("Account ID"+acc.getId()+" created");
                    break;
                case "Deposit":
                    int id = Integer.valueOf(comandArgs[1]);
                    double amount = Double.valueOf(comandArgs[2]);

                    try {
                        accounts.get(id).deposit(amount );
                        System.out.printf("Deposited %.0f to ID%d%n",amount,id);
                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                   BankAccount.setInterest(Double.parseDouble(comandArgs[1]));
                    break;
                case "GetInterest":
                    try {
                     System.out.printf("%.2f%n",accounts.get(Integer.parseInt(comandArgs[1])).getInterestRate(Integer.parseInt(comandArgs[1])));
                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                    }
                    break;
            }
        }
    }


}

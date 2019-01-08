import scholarships.Student;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name: ");
        String nameofStudent =scan.nextLine();
        System.out.println("Enter rating: ");
        double rating=scan.nextDouble();
        System.out.println("Enter amount: ");
        double amount=scan.nextDouble();
        Student student = new Student(nameofStudent,rating,amount);
        String name;
        Socket s = new Socket("127.0.0.1", 1211);
        Scanner scan2 = new Scanner(s.getInputStream());

        PrintStream printout = new PrintStream(s.getOutputStream());
        try {
            printout.println(nameofStudent);
            printout.println(rating);
            printout.println(amount);
            name = scan.nextLine();
            String input = scan2.nextLine();
            System.out.println(input);
        } catch (InputMismatchException e) {
            System.out.println("Enter a correct value");
        } finally {
            if (s != null)
                s.close();
            if (scan != null)
                scan.close();
            if (scan2 != null)
                scan2.close();
        }
    }
}
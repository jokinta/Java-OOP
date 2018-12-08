package Socket;


import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class ClientDemo {
        public static void main(String args[]) throws IOException {
            String name;
            Socket s = new Socket("192.168.0.102", 4600);
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(s.getInputStream());
            PrintStream printout = new PrintStream(s.getOutputStream());
                name = scan.nextLine();
                printout.println(name);
                String input = scan2.nextLine();
                System.out.println(input);
            }


}

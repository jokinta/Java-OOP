import scholarships.Student;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
        String name;
        double rating;
        double amount;
        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        Scanner scan2 = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println(name);
        rating = Double.parseDouble(scan.nextLine());
        System.out.println(rating);
        amount=Double.parseDouble(scan.nextLine());
        System.out.println(amount);
       Student student2 = new Student(name,rating,amount);
       if(student2.getRating()>4) {
           PrintStream printout = new PrintStream(socket.getOutputStream());
           printout.printf("Student %s is approved",student2.getName());
       }else {
           PrintStream printout = new PrintStream(socket.getOutputStream());
           printout.println("Student rejected");
       }
        server.close();// with this line scholarships would be stoped;
        scan.close();
    }
}
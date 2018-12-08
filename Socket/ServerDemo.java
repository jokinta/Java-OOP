import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
        String name;
        ServerSocket server = new ServerSocket(4600);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        Scanner scan1 = new Scanner(System.in);

        while (true) {
            name = scan.nextLine();
            PrintStream printout = new PrintStream(socket.getOutputStream());
            System.out.println(name);
            printout.println("Jovan: "+scan1.nextLine());

            if(name.equals("bye")){
                System.out.println("Chat is end");
                server.close();
                scan.close();
                break;
            }
        }
    }
}
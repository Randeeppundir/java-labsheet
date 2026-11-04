import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class HelloClient {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        try (Socket socket = new Socket(host, 5000);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("Hello Server");
            System.out.println("Message sent to " + host);
        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}

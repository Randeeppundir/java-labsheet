import java.io.PrintWriter;
import java.net.Socket;

public class MultiClientClient {
    public static void main(String[] args) {
        String message = args.length > 0 ? String.join(" ", args) : "Hello from a client";
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println(message);
            System.out.println("Sent: " + message);
        } catch (Exception e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}

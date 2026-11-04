import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            System.out.println("Enter a message (type exit to stop):");
            String message;
            while ((message = console.readLine()) != null) {
                out.println(message);
                System.out.println("Echo: " + in.readLine());
                if ("exit".equalsIgnoreCase(message)) break;
            }
        } catch (Exception e) {
            System.err.println("Echo client error: " + e.getMessage());
        }
    }
}

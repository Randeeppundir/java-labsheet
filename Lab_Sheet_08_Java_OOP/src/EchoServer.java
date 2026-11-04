import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("EchoServer waiting on port 5000...");
            try (Socket client = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(client.getInputStream()));
                 PrintWriter out = new PrintWriter(client.getOutputStream(), true)) {
                String message;
                while ((message = in.readLine()) != null) {
                    out.println(message);
                    if ("exit".equalsIgnoreCase(message)) break;
                }
            }
        } catch (IOException e) {
            System.err.println("Echo server error: " + e.getMessage());
        }
    }
}

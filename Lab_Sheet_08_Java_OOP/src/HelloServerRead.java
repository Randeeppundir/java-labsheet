import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServerRead {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server waiting on port 5000...");
            try (Socket client = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(client.getInputStream()))) {
                String message = in.readLine();
                System.out.println("Client connected");
                System.out.println("Received from client: " + message);
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}

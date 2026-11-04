import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("HelloServer is waiting on port " + port + "...");
            try (Socket client = serverSocket.accept()) {
                System.out.println("Client connected");
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}

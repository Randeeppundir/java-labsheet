import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {
    private static class ClientHandler extends Thread {
        private final Socket socket;

        ClientHandler(Socket socket, int number) {
            super("ClientHandler-" + number);
            this.socket = socket;
        }

        @Override
        public void run() {
            try (Socket client = socket;
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(client.getInputStream()))) {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println(getName() + " received: " + message);
                }
            } catch (IOException e) {
                System.err.println(getName() + " error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        int port = 5000;
        int clientNumber = 1;
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("MultiClientServer listening on port " + port);
            while (true) {
                Socket client = server.accept();
                new ClientHandler(client, clientNumber++).start();
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessageSender {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        byte[] data = "Ping".getBytes();
        try (DatagramSocket socket = new DatagramSocket()) {
            DatagramPacket packet = new DatagramPacket(
                    data, data.length, InetAddress.getByName(host), 6000);
            socket.send(packet);
            System.out.println("Sent: Ping");
        } catch (Exception e) {
            System.err.println("UDP sender error: " + e.getMessage());
        }
    }
}

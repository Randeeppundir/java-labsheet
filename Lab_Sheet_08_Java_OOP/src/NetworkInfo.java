import java.net.InetAddress;

public class NetworkInfo {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Host name: " + local.getHostName());
            System.out.println("IP address: " + local.getHostAddress());
        } catch (Exception e) {
            System.err.println("Unable to retrieve host information: " + e.getMessage());
        }
    }
}

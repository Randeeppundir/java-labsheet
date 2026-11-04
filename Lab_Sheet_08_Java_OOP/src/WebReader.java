import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebReader {
    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : "https://example.com";
        try {
            URL url = new URL(address);
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.err.println("Could not read URL (check internet access): " + e.getMessage());
        }
    }
}

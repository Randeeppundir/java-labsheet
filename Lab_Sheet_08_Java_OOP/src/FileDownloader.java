import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileDownloader {
    public static void main(String[] args) {
        String address = args.length > 0
                ? args[0] : "https://www.example.com/sample.txt";
        Path destination = Path.of(args.length > 1 ? args[1] : "sample.txt");

        try {
            URLConnection connection = new URL(address).openConnection();
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            try (InputStream in = connection.getInputStream();
                 OutputStream out = Files.newOutputStream(destination)) {
                in.transferTo(out);
            }
            System.out.println("Downloaded file to: " + destination.toAbsolutePath());
        } catch (Exception e) {
            System.err.println("Download failed: " + e.getMessage());
            System.err.println("The example URL may not host sample.txt; try a valid text-file URL.");
        }
    }
}

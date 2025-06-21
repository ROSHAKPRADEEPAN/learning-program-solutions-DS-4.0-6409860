
import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private String fileName;
    private static Map<String, RealImage> cache = new HashMap<>();

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        RealImage realImage = cache.get(fileName);

        if (realImage == null) {
            realImage = new RealImage(fileName);
            cache.put(fileName, realImage);
        } else {
            System.out.println("Using cached image: " + fileName);
        }

        realImage.display();
    }
}
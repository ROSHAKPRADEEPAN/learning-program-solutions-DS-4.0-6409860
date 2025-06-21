public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");
        Image image2 = new ProxyImage("people.jpg");
        Image image3 = new ProxyImage("nature.jpg"); 

        image1.display(); 
        image2.display(); 
        image3.display(); 
    }
}
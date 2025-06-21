public class ObserverPatternTest {
    public static void main(String[] args) {

        System.out.println();
        StockMarket stockMarket = new StockMarket("TechCorp", 100.0);

        MobileApp mobileApp = new MobileApp("MobileApp1");
        WebApp webApp = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Updating stock price...");
        stockMarket.setStockPrice(105.0);

        stockMarket.deregisterObserver(webApp);

        System.out.println("Updating stock price again...");
        stockMarket.setStockPrice(110.0);
    }
}

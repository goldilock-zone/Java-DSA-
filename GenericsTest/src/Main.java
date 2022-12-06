public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pair<String, Double> bid;
        bid = new Pair<String,Double>("MSFT", 32.07);
        System.out.println(bid.getFirst());
        
        Portfolio<Pair<String,Double>> port = new Portfolio<Pair<String,Double>>(25);
        port.set(12, bid);
    }
}

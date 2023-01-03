public class Main{
    public static void main(String[] args){
        PredatoryCreditCard card = new PredatoryCreditCard("Sarbajit", "SBI", "Current", 10000, 100, 5);
        System.out.println(card.charge(2000));
        card.makePayment(200);
        System.out.println(card.toString());
        System.out.println("Instance of test: " + (card instanceof PredatoryCreditCard));


    }
}
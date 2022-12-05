public class CounterDemo {
    public static void main(String[] args){
        //Using this class to implement counter class

        Counter c = new Counter();
        c.increment();
        c.increment(3);
        int temp = c.getCount();
        System.out.println("The value of count is: " + temp);

        
    }
}

public class Counter {
    private int count = 0;
    public Counter(){
        // empty constructor
    }
    public Counter (int initial){
        //Constructor to initialize the value of count
        count = initial;
    }
    public int getCount(){
        return count;
    }
    public void increment(){
        count++;
    }
    public void increment(int delta){
        count += delta;
    }
    public void reset(){
        count = 0;
    }

}


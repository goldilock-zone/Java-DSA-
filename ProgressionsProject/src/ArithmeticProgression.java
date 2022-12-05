public class ArithmeticProgression extends Progression {
    protected long increment;

    public ArithmeticProgression(){
        //default constructor allows increments of 1
        this.increment = 1;
    }

    public ArithmeticProgression(long stepsize){
        //default constructor allows increments of 1
        this.increment = stepsize;
    }

    public ArithmeticProgression(long stepsize, long start){
        //default constructor allows increments of 1
        super(start); //super basically calls the parent constructor
        this.increment = stepsize;
    }

    protected void advance(){
        current += increment;
    }
 
}

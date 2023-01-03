public class GeometricProgression extends Progression {
    protected long base;

    public GeometricProgression(){
        //default constructor allows increments of 1
        this.base = 2;
        super.current = 1;
    }

    public GeometricProgression(long stepsize){
        //default constructor allows increments of 1
        this.base = stepsize;
        super.current = 1;
    }

    public GeometricProgression(long stepsize, long start){
        //default constructor allows increments of 1
        super(start); //super basically calls the parent constructor
        this.base = stepsize;
    }

    protected void advance(){
        current *= base;
    }
 
}

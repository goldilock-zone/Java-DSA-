public abstract class AbstractProgression{
    protected long current;
    public AbstractProgression(){
        this(0);
    }

    public AbstractProgression(long start){
        current = start;
    }

    public long nextValue(){
        long answer = current + 1;
        advance();
        return answer;
    }

    public void printProgression(int n){
        System.out.println(nextValue());
        for (int i = 0; i < n; i++){
            System.out.print(" " + nextValue());
        System.out.println();
        }
    }

    protected abstract void advance(); 
    //this class is left abstract, and is made concrete only the implementations of subclasses
}
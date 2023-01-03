public class Progression {
    protected long current;

    public Progression(){
        //default constructor starts at 0
        this.current = 0;
    }

    public Progression (long start){
        this.current = start;
    }

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    protected void advance(){
        current++;
    }

    public void printProgression(int n){
        if (!(n == (int)n)){
            throw new IllegalArgumentException("Please enter an Integer");
        }
        System.out.print(nextValue());
        for (int i = 0; i < n; i++)
            System.out.print(" " + nextValue());

        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

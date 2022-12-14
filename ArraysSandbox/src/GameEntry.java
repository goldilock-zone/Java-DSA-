public class GameEntry{
    private String name;
    private int score;
    //Contructs a game entry with given parameters

    public GameEntry(String n, int s){
        this.name = n;
        this.score = s;
    }

    public String getName(){ return this.name; }
    public int getScore(){ return this.score; }

    public String toString(){
        return "(" + name + ", " + score + ")";
    }
}
public class Scoreboard {
    private int numEntries = 0; //keeps track of number of entries
    private GameEntry[] board; //array of game entries

    public Scoreboard(int capacity){
        // constructing an empty scoreboard
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e){
        int newScore = e.getScore();

        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()){
            if (numEntries < board.length){
                numEntries++;
            }
        }
        // shift any lower scores rightward to make room for new entry
        int j = numEntries;
        try{
            while (j > 0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
        catch (NullPointerException ex){
            board[j] = e;
        }
    }

    public GameEntry remove(int i){ //i is the index we want to remove
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid Index Input: " + i);
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++)
            board[j] = board[j+1];
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }

    public String toString(){
        String output = "";
        for (int i = numEntries - 1; i >= 0; i--){
            try{
                output += board[i].toString() + '\n';
            }
            catch (NullPointerException ex){
                output += "Empty Element" + '\n';
            }
        }

        return output;
    }
}

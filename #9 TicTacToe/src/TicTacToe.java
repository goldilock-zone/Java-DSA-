public class TicTacToe {
    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;

    private int board[][] = new int[3][3];
    private int player; //denoting the current player

    //Constructor
    public TicTacToe(){ clearBoard(); }

    public void clearBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
        player = X;
    }

    //Puts mark in location i,j
    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (i < 0) || (i > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");
        
        board[i][j] = player;
        player = - player;
    }

    public boolean isWin(int mark){ //mark means either 1 or -1
        int row0_sum = (board[0][0] + board[0][1] + board[0][2]);
        int row1_sum = (board[1][0] + board[1][1] + board[1][2]);
        int row2_sum = (board[2][0] + board[2][1] + board[2][2]);
        int col0_sum = (board[0][0] + board[1][0] + board[2][0]);
        int col1_sum = (board[0][1] + board[1][1] + board[2][1]);
        int col2_sum = (board[0][2] + board[1][2] + board[2][2]);
        int diag_sum = (board[0][0] + board[1][1] + board[2][2]);
        int redi_sum = (board[2][0] + board[1][1] + board[0][2]);

        boolean row0 = (row0_sum == mark*3);
        boolean row1 = (row1_sum == mark*3);
        boolean row2 = (row2_sum == mark*3);
        boolean col0 = (col0_sum == mark*3);
        boolean col1 = (col1_sum == mark*3);
        boolean col2 = (col2_sum == mark*3);
        boolean diag = (diag_sum == mark*3);
        boolean redi = (redi_sum == mark*3);

        boolean check = row0 || row1 || row2 || col0 || col1 || col2 || diag || redi;

        return check;
    }

    public int winner(){
        if (isWin(X))
            return (X);
        else if (isWin(O))
            return (O);
        else 
            return (0);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(); //Note the use of StringBuilder
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                switch (board[i][j]) {
                    case X: sb.append("X"); break;
                    case O: sb.append("0"); break;
                    case EMPTY: sb.append(" "); break;
                }
                if (j < 2)
                    sb.append("|");
            }
            if (i < 2)
                sb.append("\n-----\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        TicTacToe game = new TicTacToe();
        //X moves:              O moves:
        game.putMark(1,1);game.putMark(0,2);
        game.putMark(2,2);game.putMark(0,0);
        game.putMark(0,1);game.putMark(2,1);
        game.putMark(1,2);game.putMark(1,0);
        game.putMark(2,0);

        System.out.println(game);
        int winningPlayer = game.winner();
        String[] outcome = {"0 wins","Tie", "X Wins"};
        System.out.println(outcome[1 + winningPlayer]);
    }
}

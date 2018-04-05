import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {


    char[][] board = new char[3][3];
    boolean isGameFinish=false;
    int xCoordinate,yCoordinate,blankSquare=9;
    char previousPlayerMove='O';
    String input;
//    public char[][] getBoard() {
//        return board;
//    }
//
//    public void setBoard(char[][] board) {
//        this.board = board;
//    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '.';
            }

        }
    }

    public void changeBoardAccordingToInput(char[][] board)throws IOException {
        boolean playerWin=false;
        char previousPlayerMove='O';
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Player play=new Player();
        while(!isGameFinish) {
            input=br.readLine();
            String[] inputParts=input.split(",");
            xCoordinate = Integer.parseInt(inputParts[0]);
            yCoordinate = Integer.parseInt(inputParts[1]);
            if(previousPlayerMove=='X' && board[xCoordinate][yCoordinate]=='.'){
                board[xCoordinate][yCoordinate]='O';
                previousPlayerMove='O';
            }
            else if(previousPlayerMove=='O' && board[xCoordinate][yCoordinate]=='.'){
                board[xCoordinate][yCoordinate]='X';
                previousPlayerMove='X';
            }
            else{
                System.out.println("Please enter at blank location");
                continue;
            }
            play.printBoard(board);
            playerWin=play.isPlayerWin(board,xCoordinate,yCoordinate);
            blankSquare--;
            if(blankSquare==0 || playerWin)
                isGameFinish=true;
        }
        play.printWinnerName(previousPlayerMove,playerWin);
    }
}

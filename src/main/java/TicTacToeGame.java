public class TicTacToeGame {
    public static void main(String args[])throws Exception{

        Board square=new Board();
        square.initializeBoard();
        square.changeBoardAccordingToInput(square.board);
        }


    }


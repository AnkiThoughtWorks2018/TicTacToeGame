public class Player {

    public boolean isPlayerWin(char[] board[],int xCoordinate,int yCoordinate){
        boolean isDiagonalMatch=checkDiagonals(board);
        boolean isRowMatch=checkRow(board,xCoordinate);
        boolean isColumnMatch=checkColumn(board,yCoordinate);
        return isDiagonalMatch||isRowMatch||isColumnMatch;

    }

    public boolean checkDiagonals(char[][] board){
        return checkSameElementInDiagonal(board[0][0], board[1][1], board[2][2]) ||
                checkSameElementInDiagonal(board[0][2],board[1][1],board[2][0]);
    }

    public boolean checkRow(char[][] board,int xCoordinate){
        return checkSameElementInDiagonal(board[xCoordinate][0],board[xCoordinate][1],board[xCoordinate][2]);
    }

    public boolean checkColumn(char[][] board,int yCoordinate){
        if (checkSameElementInDiagonal(board[0][yCoordinate],board[1][yCoordinate],board[2][yCoordinate])) return true;
        else return false;
    }

    public boolean checkSameElementInDiagonal(char c1,char c2,char c3){
        if(c1!='.' && c1==c2 && c2==c3){
            return true;
        }
        return false;
    }

    public void printBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void printWinnerName(char previousPlayerMove,boolean playerWin){
        if(playerWin==false) {
            System.out.println("GAME DRAW");
        }
        else {
            if ((previousPlayerMove == 'X')) {
                System.out.println("X WINS");
            } else {
                System.out.println("O WINS");
            }
        }
    }
}

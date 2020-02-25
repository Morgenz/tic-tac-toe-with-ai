package board;

import java.util.Arrays;
import java.util.stream.Stream;

public class Coordinates {
    private char [][] gameBoard;

    public Coordinates(){
        gameBoard=new char[3][3];
    }

    public void setGameBoard(String gameBoard)  {
        int lengthOfRow=this.gameBoard[0].length;
        for(int i=0; i<lengthOfRow;i++){
            for(int j=0; j<lengthOfRow; j++){
                this.gameBoard[i][j]=gameBoard.charAt(lengthOfRow*i+j);
            }
        }
    }

    public void setGameBoardByXY(int x,int y,char xOrY) {
        this.gameBoard[x][y]=xOrY;
    }
}

package SnakeandLadderPractice;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;
    Board(int BoardSize,int numofSnakes,int numofLadders){
        intialize(BoardSize);
        addsnakeandLaddder(cells,numofSnakes,numofLadders);
    }

    void intialize(int BoardSize){
        cells =new Cell[BoardSize][BoardSize];
        for(int i=0;i<BoardSize;i++){
            for(int j=0;j<BoardSize;j++){
                Cell c=new Cell();
                cells[i][j]=c;
            }
        }
    }

    void addsnakeandLaddder(Cell[][]cells,int numofSnakes,int numofLadders){
        while(numofSnakes>0){
            int snakeHead= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int snakeTail= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(snakeTail>=snakeHead){
                continue;
            }

            jump2 snakeObj=new jump2();
            Cell cell=getcell(snakeHead);
            snakeObj.start=snakeHead;
            snakeObj.end=snakeTail;
            cell.jump2 =snakeObj;
            numofSnakes--;
        }

        while(numofLadders>0){
            int LadderStart= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int Ladderend= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(LadderStart>=Ladderend){
                continue;
            }

            jump2 LadderObj=new jump2();
            Cell cell=getcell(LadderStart);
            LadderObj.start=LadderStart;
            LadderObj.end=Ladderend;
            cell.jump2 =LadderObj;
            numofLadders--;
        }



    }

     Cell getcell(int playerPos){
        int row=playerPos/cells.length;
        int col=(playerPos%cells.length);
        return cells[row][col];
    }


}

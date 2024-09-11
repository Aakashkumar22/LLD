package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardsize ,int numofsnakes,int numofLadders){
        initializeCells(boardsize);
        addsnakeandLadders(cells,numofsnakes, numofLadders);
    }

    void initializeCells(int boardsize ){
        cells=new Cell[boardsize][boardsize];
        for(int i=0;i<boardsize;i++){
            for(int j=0;j<boardsize;j++){
                Cell cell=new Cell();
                cells[i][j]=cell;
            }
        }
    }

    void addsnakeandLadders(Cell[][]cells,int numofsnakes,int numofLadders){
        while(numofsnakes>0){
            int snakehead= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);

            if(snakeTail>=snakehead){
                continue;
            }
            Jump snakeobj=new Jump();
            snakeobj.start=snakehead;
            snakeobj.end=snakeTail;
            Cell cell=getcell(snakehead);
            cell.jump=snakeobj;
            numofsnakes--;


        }


        while(numofLadders>0){
            int Ladderstart= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int Ladderend= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);

            if(Ladderstart>=Ladderend){
                continue;
            }
            Jump ladderobj=new Jump();
            ladderobj.start=Ladderstart;
            ladderobj.end=Ladderend;
            Cell cell=getcell(Ladderstart);
            cell.jump=ladderobj;
            numofLadders--;


        }
    }






    Cell getcell(int playerpostion){
        int row=playerpostion/cells.length;
        int col=(playerpostion % cells.length);
        return  cells[row][col];
    }
}

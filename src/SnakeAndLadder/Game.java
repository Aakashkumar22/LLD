package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Player winner;
    Deque<Player> playerlist=new LinkedList<>();


    Game(){
        initializeGame();
    }

    void initializeGame(){
        board=new Board(10,5,4);
        dice=new Dice(1);
        winner=null;
        addplayers();
    }

    void addplayers(){
        Player p1=new Player("p1",0);
        Player p2=new Player("p2",0);
        playerlist.add(p1);
        playerlist.add(p2);
    }

    void start(){

        Player playerTurn=findplayerTurn();
        System.out.println("Currr player is:"+playerTurn.id+ " current position is:"+playerTurn.currentPosition);
        int dicnumber= dice.rolldice();
        int playernewpos= playerTurn.currentPosition+dicnumber;
        playernewpos=jumcheck(playernewpos);
        playerTurn.currentPosition=playernewpos;

        System.out.println("Currr player is:"+playerTurn.id+ " new position is:"+playernewpos);

        if(playernewpos>=board.cells.length*board.cells.length-1){
            winner=playerTurn;
        }
        System.out.println(" Winner is :"+ winner.id);

    }

     public Player findplayerTurn(){
        Player playerTurn=playerlist.removeFirst();
        playerlist.add(playerTurn);
        return playerTurn;
    }

    int jumcheck(int playernewpos){
        if(playernewpos>board.cells.length*board.cells.length-1){
            return playernewpos;
        }

        Cell cell= board.getcell(playernewpos);
        if(cell.jump!=null && cell.jump.start==playernewpos){
            String Jumpby=(cell.jump.start<cell.jump.end)?"ladder":"snake";
            return cell.jump.end;
        }
        return playernewpos;
    }

}

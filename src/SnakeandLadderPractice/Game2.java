package SnakeandLadderPractice;

import java.util.Deque;
import java.util.LinkedList;

public class Game2 {
    Board board;
    Dice dice;
    Player winner;
    Deque<Player>playerlist=new LinkedList<>();

    Game2(){
        initializesetup();
    }

    void initializesetup(){
        board=new Board(10,5,4);
        dice=new Dice(1);
        winner=null;
        addplayer();


    }
    void addplayer(){
        Player p1= new Player("Shubham",0,"P1");
        Player p2=new Player("Aakash",0,"p2");
        playerlist.add(p1);
        playerlist.add(p2);

    }

    void start() {

        while (winner == null) {
            Player PlayerTurn = findPlayerTurn();
            System.out.println(" The player is :" + PlayerTurn.name + " Id is :" + PlayerTurn.id + " Position is :" + PlayerTurn.position);
            int dicenumber = dice.rolldice();
            int playerNewpos = PlayerTurn.position + dicenumber;
            playerNewpos=jumpcheck(playerNewpos);
            PlayerTurn.position = playerNewpos;
            System.out.println(" The player is :" + PlayerTurn.name + " Id is :" + PlayerTurn.id + " Position is :" + playerNewpos);



            if(playerNewpos>=board.cells.length*board.cells.length-1){
                winner=PlayerTurn;
            }

        }
        System.out.println(" The winner is :"+winner.name+" The id is :"+winner.id+" and position is :"+winner.position);

    }

    Player findPlayerTurn(){
        Player playerturn=playerlist.removeFirst();
        playerlist.add(playerturn);
        return playerturn;
    }

    int jumpcheck(int playernewPos){
        if(playernewPos>board.cells.length*board.cells.length-1){
            return playernewPos;
        }

        Cell cell= board.getcell(playernewPos);
        if(cell.jump2 !=null && cell.jump2.start==playernewPos){
            String jumpby=(cell.jump2.start<cell.jump2.end)?"Ladder":"snake";
            System.out.println(" jump done by"+jumpby);
            return cell.jump2.end;
        }
        return playernewPos;
    }
}

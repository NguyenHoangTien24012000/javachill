package MiniGame;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private int answer;
    private ArrayList<Player> players;

    private Player playerWin;

    public Game(ArrayList<Player> players) {
        this.players = players;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setPlayerWin(Player playerWin) {
        this.playerWin = playerWin;
    }

    public void startGame(){
        Random random = new Random();
        setAnswer(random.nextInt(10));
        System.out.printf("Player start guess: ");
        for(Player player: players){
            player.choseGuess();
            if( player.getGuess() == getAnswer()){
                setPlayerWin(player);
            }
        }
        System.out.println("Answer game: " + getAnswer());
        System.out.println("Answer player: ");
        for (Player player: players){
            System.out.printf("%s answer: %d%n", player.getName() ,player.getGuess());
        }
        if(playerWin != null){
            System.out.printf("Player won is: %s", playerWin.getName());
        }else {
            System.out.println("Not player won");
        }
    }
}

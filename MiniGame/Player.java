package MiniGame;

import java.util.Scanner;

public class Player {
    private String name;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public void choseGuess(){
        while (true){
            System.out.printf("%s enter guess (0 -> 9): ",  name);
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                int numberGuess = scanner.nextInt();
                if(numberGuess >= 0 && numberGuess <= 9){
                    setGuess(numberGuess);
                    break;
                }
            }else{
                System.out.printf("Enter type number!!!");
            }
        }
    }

}

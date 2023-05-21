package MiniGame;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Tien");
        Player player2 = new Player("Tien");
//        Player player3 = new Player("Hoang");
//        ArrayList<Player> players = new ArrayList<>(List.of(player1, player2, player3));
//        Game newGame = new Game(players);
//        newGame.startGame();
        String str1 = "123";
        String str2 = "123";
        if(str1 == str2){
            System.out.println("true");
        }
        System.out.println(player1.equals(player2));
    }
}

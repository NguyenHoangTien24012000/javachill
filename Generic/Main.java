package Generic;


interface Player {
    String name();
};

record FootballPlayer(String name, String position) implements Player{};
record BaseballPlayer(String name, String position) implements Player{};
public class Main {
    public static void main(String[] args) {
        BaseballTeam tien = new BaseballTeam("Nam Dinh");
        BaseballTeam tung = new BaseballTeam("Ha Noi");
        scoreResult(tien, tung, 100, 90);

        SportTeam tien1 = new SportTeam("Nam Dinh1");
        SportTeam tung1 = new SportTeam("Ha Noi1");
        scoreResult(tien1, tung1, 100, 90);

        BaseballPlayer player1 = new BaseballPlayer("Tien", "middle");
        BaseballPlayer player2 = new BaseballPlayer("Nam", "defer");
        tien.addPlayer(player1);
        tien.addPlayer(player2);
        tien.listTeamMember();
        System.out.printf("-".repeat(50));

        SportTeam sportTeam = new SportTeam("TienTEST");
        FootballPlayer footballPlayer1 = new FootballPlayer("football1","tien ve");
        FootballPlayer footballPlayer2 = new FootballPlayer("football2", "hau ve");
        sportTeam.addPlayer(footballPlayer1);
        sportTeam.addPlayer(player1);
        sportTeam.listTeamMember();

        Affiliation affiliation1 = new Affiliation("City", "NewYork", "USA");
        Team<FootballPlayer, Affiliation> tien2 = new Team("Nam Dinh2", affiliation1);
        Team<BaseballPlayer, String> tung2 = new Team("Ha Noi2", "OKOK");
        scoreResult(tien2, tung2, 100, 90);
        tien2.addPlayer(footballPlayer2);
        tien2.listTeamMember();
        tung2.listTeamMember();




    }
    public static void scoreResult(BaseballTeam team1, BaseballTeam team2, int score1, int score2){
        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportTeam team1, SportTeam team2, int score1, int score2){
        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    public static void scoreResult(Team team1, Team team2, int score1, int score2){
        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}

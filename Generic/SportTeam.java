package Generic;

import java.util.ArrayList;
import java.util.List;

public class SportTeam {
    private String name;
    private List<Player> teamMembers = new ArrayList<>();

    public SportTeam(String name) {
        this.name = name;
    }

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public void addPlayer(Player player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }
    public void listTeamMember(){
        System.out.println(name + " Roster!");
        System.out.println(teamMembers);
    }
    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }
    public String setScore(int ourScore, int theirScore){
        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "win to";
        }else if(ourScore == theirScore){
            totalTies++;
            message = "tied";
        }else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return name + " (Ranked " + ranking() + ")";
    }
}

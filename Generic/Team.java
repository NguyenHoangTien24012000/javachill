package Generic;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return name + "(type: " + type + " in " + countryCode + ")";
    }
};
public class Team<T extends Player, S>{
    private String name;
    private List<T> teamMembers = new ArrayList<>();

    private S affiliation;

    public Team(String name, S affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }

    public Team(String name) {
        this.name = name;
    }

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public void addPlayer(T t){
        if(!teamMembers.contains(t)){
            teamMembers.add(t);
        }
    }
    public void listTeamMember(){
        System.out.println(name + " Roster!");
        System.out.println((affiliation == null ? "" : " affiliation " + affiliation));
        for(T t : teamMembers){
            System.out.println(t.name());
        }
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

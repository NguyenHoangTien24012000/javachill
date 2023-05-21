package Enum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek day = DayOfTheWeek.MON;
        System.out.printf("name day %s, origin value: %d%n", day.name(), day.ordinal());
        DayOfTheWeek dayRandom = getDayWeek();
        System.out.printf("Day random: " + dayRandom + " origin value: " + dayRandom.ordinal());
    }
    public static DayOfTheWeek getDayWeek(){
        int random = new Random().nextInt(7);
        DayOfTheWeek[] allDay = DayOfTheWeek.values();
        return allDay[random];
    }
}

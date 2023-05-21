package OOP.encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocker out of game");
        }
    }
    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health <= 0){
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        }else {
            this.health = health;
        }

        this.weapon = weapon;
    }
    public int healthRemaining(){
        return  this.health;
    }
    public void restoreHealth(int extraHealth){
        this.health += extraHealth;
        if(this.health >= 100){
            this.health = 100;
            System.out.println("Player restore to 100%");
        }
    }
}

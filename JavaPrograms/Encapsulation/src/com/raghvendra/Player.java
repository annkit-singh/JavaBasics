package com.raghvendra;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(health <= 0) {
            System.out.println("Player knocked out");
            //Reduce the number of lives for the player.
        }
    }

    public int getHealth() {
        return this.health;
    }
}

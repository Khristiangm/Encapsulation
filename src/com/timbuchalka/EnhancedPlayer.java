package com.timbuchalka;

/**
 * Created by KH389659 on 29/09/2017.
 */
public class EnhancedPlayer {

    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }else{
            System.out.println("You Can't Start with so much Life");
            this.hitPoints = 100;

        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){

        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("You are Dead");
            //Reduce the number of lives remaining for the player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}

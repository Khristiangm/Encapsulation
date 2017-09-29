package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Khristian";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 30;
//        player.loseHealth(damage);
//        System.out.println("Lives Remaining " + player.healthRemaining());
//
//        damage = 70;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Lives Remaining " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Royal", 50, "Axe");
        System.out.println("Your Initial Life is: " + enhancedPlayer.getHitPoints());



    }
}

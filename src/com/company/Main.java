package com.company;

public class Main {

    public static void main(String[] args) {

        Warior warior = new Warior();
        warior.setName("Грозный Воин");
        warior.setDamage(100);
        warior.setHealth(700);
        warior.getSuperHint();

        Magical magical = new Magical();
        magical.setName("Гендальф");
        magical.setHealth(700);
        magical.setDamage(80);
        magical.getSuperHint();

        Mental mental = new Mental();
        mental.setName("Йода");
        mental.setHealth(1000);
        mental.setDamage(850);
        mental.getSuperHint();
    }
}

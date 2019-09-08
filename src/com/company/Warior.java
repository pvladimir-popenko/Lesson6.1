package com.company;

import java.util.Random;

public class Warior extends Player implements IActionable{
     @Override
    public void getSuperHint() {
         String[] superHint = {"Оружейная", "Магическая", "Ментальная"};
         Random r = new Random();
         int randomNumber = r.nextInt(3);
        System.out.println(name + " использовал " + superHint[randomNumber] + " атаку");
    }
}

package com.letscode.example.aula2;

public class Avatar {
    public static void main(String[] args) {

        String fire = ElementoDoAvatar.FIRE.name() == "FIRE" ? "fogo" : "fire";
        String water = ElementoDoAvatar.WATER.name() == "WATER" ? "água" : "water";
        String air = ElementoDoAvatar.AIR.name() == "AIR" ? "ar" : "air";
        String earth =  ElementoDoAvatar.EARTH.name() == "EARTH"? "terra" : "earth";

        System.out.println("Zuko é do tipo " + fire);
        System.out.println("Katara é do tipo " + water);
        System.out.println("Aang é do tipo " + fire + ", " + water + ", " + air + " e " + earth);
        System.out.println("Toph é do tipo " + earth);

    }
}

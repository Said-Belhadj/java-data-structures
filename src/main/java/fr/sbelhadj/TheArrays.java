package fr.sbelhadj;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];

        // Assigner un élément à un tableau.
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "purple";

        System.out.println(Arrays.toString(colors));

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        // Parcourir un tableau et afficher ses éléments. V1
        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        // Parcourir un tableau et afficher ses éléments. V2
        for(String color : colors){
            System.out.println(color );
        }

        // Parcourir un tableau et afficher ses éléments. V3
        Arrays.stream(colors).forEach(System.out::println);
    }
}

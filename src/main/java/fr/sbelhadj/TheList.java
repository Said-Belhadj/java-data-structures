package fr.sbelhadj;

import java.util.ArrayList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {

        // Simplement un tableau extensible : une liste
        List<String> colors = new ArrayList();
        colors.add("yellow");
        colors.add("blue");

        System.out.println(colors);
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        colors.stream().forEach(System.out::println);

        // Une list non modifiable

        List<String> colors2= List.of(
                "yello",
                "red"
        );

        // erreur car on ne peut pas modifier ce type d'objet Immutable
        colors2.add("pink");
    }
}

package fr.sbelhadj;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TheSet {
    public static void main(String[] args) {
        // a Set doesn't guarantee order

        // Tree set preserve the order

        Set<Ball> balls = new HashSet();
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("purple"));



    }

    record Ball(String color){}
}

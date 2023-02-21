package fr.sbelhadj;

import java.sql.PseudoColumnUsage;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList();
        linkedList.add(new Person("Marie", 23));
        linkedList.add(new Person("Ali", 34));

        ListIterator<Person> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("------Reverse------");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Marie", 23));
        supermarket.add(new Person("Ali", 34));
        supermarket.add(new Person("John", 17));

        System.out.println("Who is the first of the queue ? "+supermarket.peek());
        System.out.println("\nRemove " + supermarket.poll() + "\nLook now who is the first of the queue " + supermarket.peek());
        System.out.println("\nLook at the queue now : "+supermarket);
        supermarket.offer(new Person("Mariam", 27));
        System.out.println("\nAnother person came to the queue : "+supermarket);
    }

    static record Person(String name, int age){}
}

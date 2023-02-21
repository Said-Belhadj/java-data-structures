package fr.sbelhadj;

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.add("1st");
        stack.add("2nd");
        stack.add("3rd");

        stack.stream().forEach(System.out::println);
        System.out.println("--------------------");

        String last = stack.peek();
        System.out.println("Top of the stack (the last in) : "+last);;
        System.out.println("--------------------");

        stack.stream().forEach(System.out::println);

        System.out.println("--------------------");
        stack.pop();
        stack.stream().forEach(System.out::println);

        System.out.println("--------------------");
        stack.push("last");
        stack.stream().forEach(System.out::println);

        System.out.println("--------------------");
        System.out.println("Stack.search(\"1st\") \n output : "+stack.search("1st"));

        System.out.println("--------------------");
        System.out.println("Stack.search(\"2nd\") \n output : "+stack.search("2nd"));

        System.out.println("--------------------");
        System.out.println("Stack.search(\"last\") \n output : "+stack.search("last"));

        System.out.println("--------------------");
        System.out.println("Size : "+stack.size());

    }
}

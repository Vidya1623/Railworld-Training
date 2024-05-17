//LinkedList Implementation-

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());
        animals.removeFirst();
        System.out.println("LinkedList after removing first element: " + animals);
    }
}





//Stack implementation

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
     
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.isEmpty()); 
    }
}





//Queue implemetation-

import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        
        LinkedList<Integer> queue = new LinkedList<>();

        
        queue.add(1);
        queue.add(2);
        queue.add(3);

        int element = queue.remove();

        System.out.println("Removed element: " + element);

        System.out.println("Queue: " + queue);
    }
}



//map implementation

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        
        HashMap<String, Integer> hashMap = new HashMap<>();

        
        hashMap.put("Alice", 95);
        hashMap.put("Bob", 80);
        hashMap.put("Charlie", 75);

       
        System.out.println("HashMap: " + hashMap);

      
        int bobGrade = hashMap.get("Bob");
        System.out.println("Bob's Grade: " + bobGrade);

        
        boolean hasCharlie = hashMap.containsKey("Charlie");
        System.out.println("Does Charlie exist? " + hasCharlie);

        
        hashMap.remove("Charlie");

        
        System.out.println("HashMap: " + hashMap);
    }
}
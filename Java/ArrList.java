import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        animals.add(2, "Duck"); // Add in specific position

        System.out.println(animals.get(0)); // get specific element

        animals.remove(3);
        System.out.println("Array size " + animals.size() +"\n");

        Collections.sort(animals); // sort
        // Collections.sort(animals, Collections.reverseOrder()); to reverse the order

        for (String i : animals){
            System.out.println(i);
        }

        /*
        Linked list methods:
            addFirst()	Adds an element to the beginning of the list	
            addLast()	Add an element to the end of the list	
            removeFirst()	Remove an element from the beginning of the list	
            removeLast()	Remove an element from the end of the list	
            getFirst()	Get the element at the beginning of the list	
            getLast()	Get the element at the end of the list
        */
    }    
}

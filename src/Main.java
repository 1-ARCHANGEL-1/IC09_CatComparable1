import java.util.ArrayList;
import java.util.Collections;

public class Main
{

    public static void main(String[] args)
    {
        //ArrayList is a collection of related data, under
        //a single data type that is:
        //dynamically size, cannot grow/shrink
	    ArrayList<Cat> clowder = new ArrayList<>();
        //Default capacity = 10
        //add some of our class cats to the clowder

        clowder.add(new Cat("Boba Pearl", "Tuxedo", 2));
        clowder.add(new Cat("Dino", "Black Cat", 8));
        clowder.add(new Cat("Cole", "Orange", 6));
        clowder.add(new Cat("Lucy", "Tuxedo", 8));
        clowder.add(new Cat("Winona", "Black", 3));

        //To remove an object from array list
        //clowder.remove(2);
        //or
        //clowder.remove(cole);


        //With ArrayLists, they can be automatically sorted
        //in ascending order
        System.out.println("\n--------Unsorted clowder of cats-------");
        //use for ach loop with array lists
        //For each Cat object (temporarily naming c) in the ArrayList named clowder
        for(Cat c: clowder)
            System.out.println(c);
        Collections.sort(clowder);


        System.out.println("\n--------Sorted clowder of cats-------");
        for(Cat c: clowder)
            System.out.println(c);

    }
}

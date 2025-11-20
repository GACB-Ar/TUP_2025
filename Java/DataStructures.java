import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class DataStructures {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> myArray = new ArrayList<String>();
    
        myArray.add("Toyota");
        myArray.add("BMW");
        myArray.add("Ford");

        System.out.println(myArray);

        // HashSet -> every element in this collection is unique
        HashSet<String> myHashSet = new HashSet<String>();

        myHashSet.add("Toyota");
        myHashSet.add("Toyota");
        myHashSet.add("BMW");
        myHashSet.add("Ford");

        System.out.println(myHashSet);

        // HashMap -> key/value pair
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");

        System.out.println(capitalCities);

        // Iterator
        Iterator<String> it = myArray.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

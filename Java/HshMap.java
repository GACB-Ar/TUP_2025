import java.util.HashMap;

public class HshMap {
    public static void main(String[] args) {
        HashMap <String, String[]> states = new HashMap<String, String[]>();

        states.put("Argentina", new String[] {"Corrientes", "Chaco"}); // dictionary of arrays
        states.put("Japan", new String[] {"Saga", "Okinawa"});

        for (String country : states.keySet()) {
            System.out.println("Country: " + country);
            for (String province : states.get(country)) {
                System.out.println("\t" + province);
            }
        }
    }

    /*
    Other Useful Algorithms
        The Collections class contains many more algorithms, such as:

        Collections.binarySearch(names, "Angie");
        Collections.sort(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        Collections.max() - find the largest element
        Collections.min() - find the smallest element
        Collections.shuffle() - randomly shuffle elements
        Collections.frequency() - count how many times an element appears
        Collections.swap() - swap two elements in a list
    */
}

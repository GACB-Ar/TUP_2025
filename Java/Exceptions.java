public class Exceptions {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[4]);
        } catch (Exception OutBound) {
            System.out.println("Something went wrong.");
        }
    }
    /*

    throw new [exception type]
    ArithmeticError                     Occurs when a numeric calculation goes wrong
    ArrayIndexOutOfBoundsException  	Occurs when trying to access an index number that does not exist in an array
    ClassNotFoundException	            Occurs when trying to access a class that does not exist
    FileNotFoundException	            Occurs when a file cannot be accessed
    InputMismatchException	            Occurs when entering wrong input (e.g. text in a numerical input)
    IOException	                        Occurs when an input or output operation fails
    NullPointerException	            Occurs when trying to access an object referece that is null
    NumberFormatException	            Occurs when it is not possible to convert a specified string to a numeric type
    StringIndexOutOfBoundsException	    Occurs when trying to access a character in a String that does not exist
    */
}

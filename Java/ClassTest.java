import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");

        String userName =   myObj.nextLine();
        System.out.println("Username is: " + userName);
        myObj.close();
    }
}

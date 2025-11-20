import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
// import java.io.FileNotFoundException;
import java.util.Scanner;
import java.nio.file.Paths;;

public class Files {
    static void writeFile(String fileLocation, String input){
        try{
            FileWriter myWriter = new FileWriter(fileLocation, true);

            myWriter.write(input);
            myWriter.close();

            System.out.println("<<<Successfully wrote to the file.>>>");
        } catch (IOException a){
            System.out.println("An error ocurred writing the file");
            a.printStackTrace();
        }
    }

    static void readFile(String file){
        try (Scanner myReader = new Scanner(Paths.get(file))){
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (IOException a) {
            System.out.println("File not found");
            a.printStackTrace();
        }
    }

    /*
    public class DeleteFile {
        public static void main(String[] args) { 
            File myObj = new File("filename.txt"); 
                if (myObj.delete()) { 
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            } 
        } 
    } 
    */

    public static void main(String[] args) {
        String filePath = "output/new.txt";

        try{
            File myText = new File(filePath);
            if (!myText.exists()){
                myText.createNewFile();
                System.out.println("File created: " + myText.getName());
            }else{
                System.out.println("File already created");
            }
        } catch(IOException e){
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }

        writeFile(filePath ,"\nappended to text 3");
        readFile(filePath);
    }
}
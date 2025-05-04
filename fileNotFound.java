import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileNotFound {

    public static void main(String[] args) {
        System.out.println("Welcome to read File");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the File Number:");
        String filename=input.next();

        try(FileReader reader = new FileReader(filename)){
            int read;
            while ((read=reader.read())!=-1) {
                System.out.println((char)read);
            }
        }
             catch (IOException  e) {
                System.out.printf("Exception occurred: %s",e.getMessage());
            }
        }
    }

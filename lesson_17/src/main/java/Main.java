import java.io.*;
import java.net.ConnectException;
import java.util.Scanner;

public class Main {

    public static void main2(String[] args) {
        String path = "/Users/taraskarpenko/Engineering/playground/QA-Automation/lesson_17/src/main/java/contentt.txt";

        try (
                FileReader reader = new FileReader(path);
                BufferedReader bufReader = new BufferedReader(reader);
                Scanner sc = new Scanner(System.in);
        ) {

            String line;
            while((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (TooSmallIntegerException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getMinimal());
            throw new IllegalArgumentException(ex.getMessage());

        }
    }
    public static void doSomething(){
        throw new TooSmallIntegerException("Integer is too small", 10);
    }

}

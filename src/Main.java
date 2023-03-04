import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner inputScanner = new Scanner(System.in);
        String input = " ";

        while(!converter.CheckIfBinary(input))
        {
            System.out.println("Please Enter a Binary Number");
            input = new String(inputScanner.nextLine());
        }

        System.out.println("The Octal Result: " + converter.ConvertBinaryToOctal(input));
    }
}

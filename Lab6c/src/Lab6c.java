import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Lab6c {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/fff.java");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line =  bufferedReader.readLine();
            line = line.replace(".", "");
            line = line.replace(",", "");
            line = line.replace("/", "");
            line = line.replace("*", "");
            line = line.replace("!", "");
            line = line.replace("?", "");
            bufferedWriter.write(line);
            String regex = "(\\s+)";
            String[] line1 = line.split(regex);
            for(int i=0; i < line1.length; i++) {
                line1[i] = line1[i].intern();
            }
            String line2;
            for (int i = 0; i < line1.length; i++) {
                if(line1[i].length() > 2) {
                     line2 = line1[i].toUpperCase();
                }
                else{
                     line2 = line1[i];
                }
                System.out.println(line2);
                bufferedWriter.write(line2);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Выполнено!");
    }
}

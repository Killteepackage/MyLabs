import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6a {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/input.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line =  bufferedReader.readLine();
            line = line.replace(".", "");
            line = line.replace(",", "");
            bufferedWriter.write(line);
            String regex = "(\\s+)";
            String[] line1 = line.split(regex);
            for(int i=0; i < line1.length; i++) {
                line1[i] = line1[i].intern();
            }
             for (int i = 0; i < line1.length-1; i++) {
            if(Character.toLowerCase(line1[i].charAt(line1[i].length()-1))
                    == Character.toLowerCase(line1[i+1].charAt(0))) {
                System.out.println(line1[i] + " " + line1[i+1]);
                bufferedWriter.write(line1[i] + " " + line1[i+1]);
                bufferedWriter.newLine();
            }
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Проверено!");
    }
}

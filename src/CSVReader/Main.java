package CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "/Users/margueriteblair/Desktop/anime.csv";
        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}

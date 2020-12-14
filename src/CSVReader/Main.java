package CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Working!");
        String path = "/Users/margueriteblair/Desktop/anime.csv";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    }
}

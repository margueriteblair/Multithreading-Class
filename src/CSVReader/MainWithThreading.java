package CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainWithThreading {
    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        String path = "/Users/margueriteblair/Desktop/anime.csv";
        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] values = line.split(",");
            System.out.println(values[1] + " is a " + values[2] + " and has a rating of " + values[5]);
        }
        long endTime = System.nanoTime();
        long durationInMilliseconds = (endTime - startTime) / 1000000;
        //prev: 485189006
        //current: 511 milliseconds
        System.out.println("The process without threading ran in: " + durationInMilliseconds + " milliseconds");
    }
}

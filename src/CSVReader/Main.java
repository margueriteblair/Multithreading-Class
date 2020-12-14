package CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    //link to .csv file: https://www.kaggle.com/CooperUnion/anime-recommendations-database
    public static void main(String[] args) throws Exception {
        String path = "/Users/margueriteblair/Desktop/anime.csv";
        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] values = line.split(",");
            System.out.println(values[0]);
        }
    }
}

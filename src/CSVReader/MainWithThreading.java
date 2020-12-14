package CSVReader;

import java.io.*;

public class MainWithThreading extends Thread {

    InputStream in;

    public MainWithThreading(String path) throws Exception {
        in=new FileInputStream(path);
        this.start();
    }
    public void run() {
        int i = 0;
        while (i != -1) {
            try {
                i = in.read();
                System.out.println((char)i);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        try {
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

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
        System.out.println("The process without threading ran in: " + durationInMilliseconds + " milliseconds");
    }
}

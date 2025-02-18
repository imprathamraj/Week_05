package com.csvdatahandling.basicproblems.readacsvfileandprintdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingPrintingMethod {
    public static void readingPrintingMethod(String filePath){
        // Try block
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                System.out.println(columns[0] + "\t" + columns[1] + " " +  columns[2] + " " + columns[3] + "\n" );
            }
        }
        // Catch Block
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

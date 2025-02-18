package com.csvdatahandling.basicproblems.readandcountrowsinacsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAndCountingRowsInCSVFile {
    public static void readingAndCountingRowsInCSVFile(String filePath){
        // Try block
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            int count = 0;
            boolean isFirstRow = true;
            while ((line = br.readLine()) != null) {
                // Condition to skip header row
                if (isFirstRow) {
                    isFirstRow = false;
                    continue;
                }
                count++;
            }
            System.out.println("The number of records (excluding the header row) - " + count);
        }
        // Catch Block
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

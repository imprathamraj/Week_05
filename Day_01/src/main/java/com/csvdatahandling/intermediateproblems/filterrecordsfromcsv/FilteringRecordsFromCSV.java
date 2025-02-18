package com.csvdatahandling.intermediateproblems.filterrecordsfromcsv;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilteringRecordsFromCSV {
    public static void filterRecordsFromCSV(String filePath){
        // Try Block
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine= reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                if((Integer.parseInt(nextLine[3]))>=80) {
                    System.out.println(nextLine[0] + " " + nextLine[1] + " " + nextLine[2] + " " + nextLine[3] );
                }
            }
        }
        // Catch Block
        catch(IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}

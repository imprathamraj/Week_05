package com.csvdatahandling.intermediateproblems.searchforarecordincsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class SearchingForARecordInCSV {
    public static void searchingForARecordInCSV(String filePath,String name){
        // Try Block
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine= reader.readNext();
            // Boolean flag taken if no record found
            boolean flag = true;
            while ((nextLine = reader.readNext()) != null) {
                // Condition to check entered name and name in csv file
                if(Objects.equals(name, nextLine[1])){
                    System.out.println("ID - " + nextLine[0] + "NAME - " + nextLine[1] + "SALARY - " + nextLine[2] );
                    flag = false;
                }
            }
            // Condition for no record found
            if(flag){
                System.out.println("Record not found with this name");
            }
        }
        // Catch Block
        catch(IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}

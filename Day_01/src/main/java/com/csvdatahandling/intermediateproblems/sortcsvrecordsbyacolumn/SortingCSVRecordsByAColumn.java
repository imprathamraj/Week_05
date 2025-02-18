package com.csvdatahandling.intermediateproblems.sortcsvrecordsbyacolumn;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SortingCSVRecordsByAColumn {
    public static void sortingCSVRecordsByAColumn(String filePath){
        MyComparator comparator = new MyComparator();
        Set<String[]> set = new TreeSet<>(comparator);
        // Try Block
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            //Skipping header
            String[] nextLine= reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                set.add(nextLine);
            }
        }
        // Catch Block
        catch(IOException | CsvValidationException e){
            e.printStackTrace();
        }
        // Try Block
        try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){
            writer.writeAll(set);
        }
        // Catch Block
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
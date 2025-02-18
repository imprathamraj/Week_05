package com.csvdatahandling.basicproblems.writedatatoacsvfile;

import java.io.*;

public class WritingDataToCSVFile {
    public static void writingDataToCSVFile(String outputFile) {
        // Try block
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("ID, Name, Department, Salary\n");
            writer.write("001, Pratham Raj, Analyst 26900\n");
            writer.write("002, Suraj Kumar Patel, Analyst* 32200\n");
            writer.write("003, Vivek Kumar Sahu, Analyst 26900\n");
            writer.write("004, Rishika Bisht, Analyst, 26900\n");
            writer.write("005, Rahul Kumar, Analyst*, 32200\n");
            System.out.println("CSV file written successfully!");
        }
        // Catch Block
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

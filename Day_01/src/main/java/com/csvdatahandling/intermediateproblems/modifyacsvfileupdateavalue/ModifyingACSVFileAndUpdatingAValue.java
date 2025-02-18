package com.csvdatahandling.intermediateproblems.modifyacsvfileupdateavalue;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModifyingACSVFileAndUpdatingAValue {
    public static void modifyingACSVFileAndUpdatingAValue(String filePath) {
        // Boolean flag taken if no record found
        boolean flag = true;
        List<String[]> list = new ArrayList<>();
        String department = "IT";

        // Try Block
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                // Condition to check entered department and department in csv file
                if (Objects.equals(department, nextLine[2])) {
                    Double salary = (Double.parseDouble(nextLine[3]) + (Double.parseDouble(nextLine[3]) * 10 / 100.0));
                    nextLine[3] = String.valueOf(salary);
                    flag = false;
                }
                list.add(nextLine);
            }

            // Condition for no record found
            if (flag) {
                System.out.println("Record not found for IT");
                return;
            }
        }
        // Catch Block
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
            return;
        }

        // Try Block for writing the updated data to the same file
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeAll(list);
            System.out.println("Salary updated successfully");
        }
        // Catch Block
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

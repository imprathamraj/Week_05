/*2️⃣ Write Data to a CSV File
Create a CSV file with employee details (ID, Name, Department, Salary).
Write at least 5 records to the file.
*/
package com.csvdatahandling.basicproblems.writedatatoacsvfile;

import static com.csvdatahandling.basicproblems.writedatatoacsvfile.WritingDataToCSVFile.writingDataToCSVFile;

public class WriteDataToCSVFile {
    public static void main(String[] args){
        // Output csv file path
        String outputFile ="src/main/java/com/csvdatahandling/basicproblems/writedatatoacsvfile/outputFile.csv";
        // Calling method
        writingDataToCSVFile(outputFile);
    }
}

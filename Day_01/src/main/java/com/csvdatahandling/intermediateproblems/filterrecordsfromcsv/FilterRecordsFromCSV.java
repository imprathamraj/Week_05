/*4️⃣ Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.
*/
package com.csvdatahandling.intermediateproblems.filterrecordsfromcsv;

import static com.csvdatahandling.intermediateproblems.filterrecordsfromcsv.FilteringRecordsFromCSV.filterRecordsFromCSV;

public class FilterRecordsFromCSV {
    public static void main(String[] args){
        // File Path
        String filePath = "src/main/java/com/csvdatahandling/intermediateproblems/filterrecordsfromcsv/Sample.csv";
        // Calling method
        filterRecordsFromCSV(filePath);
    }
}

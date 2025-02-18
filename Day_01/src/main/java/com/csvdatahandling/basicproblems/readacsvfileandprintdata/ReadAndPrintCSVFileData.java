/*1️⃣ Read a CSV File and Print Data
Read a CSV file containing student details (ID, Name, Age, Marks).
Print each record in a structured format.
*/
package com.csvdatahandling.basicproblems.readacsvfileandprintdata;

import static com.csvdatahandling.basicproblems.readacsvfileandprintdata.ReadingPrintingMethod.readingPrintingMethod;

public class ReadAndPrintCSVFileData {
    public static void main(String[] args) {
        // CSV file path
        String filePath = "src/main/java/com/csvdatahandling/basicproblems/readacsvfileandprintdata/Sample.csv";
        // Calling method
        readingPrintingMethod(filePath);
    }
}

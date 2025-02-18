/*3️⃣ Read and Count Rows in a CSV File
Read a CSV file and count the number of records (excluding the header row).
*/
package com.csvdatahandling.basicproblems.readandcountrowsinacsvfile;

import static com.csvdatahandling.basicproblems.readandcountrowsinacsvfile.ReadingAndCountingRowsInCSVFile.readingAndCountingRowsInCSVFile;

public class ReadAndCountRowsInCSV {
    public static void main(String[] args){
        // CSV File Path
        String filePath = "src/main/java/com/csvdatahandling/basicproblems/readandcountrowsinacsvfile/Sample.csv";
        // Calling method
        readingAndCountingRowsInCSVFile(filePath);
    }
}

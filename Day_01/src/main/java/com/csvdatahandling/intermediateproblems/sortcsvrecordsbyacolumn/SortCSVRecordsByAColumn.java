/*7️⃣ Sort CSV Records by a Column
Read a CSV file and sort the records by Salary in descending order.
Print the top 5 highest-paid employees.
*/
package com.csvdatahandling.intermediateproblems.sortcsvrecordsbyacolumn;

import java.io.IOException;

import static com.csvdatahandling.intermediateproblems.sortcsvrecordsbyacolumn.SortingCSVRecordsByAColumn.sortingCSVRecordsByAColumn;

public class SortCSVRecordsByAColumn {
    public static void main(String[]args) throws IOException {
        // File Path
        String filePath = "src/main/java/com/csvdatahandling/intermediateproblems/sortcsvrecordsbyacolumn/employee.csv";
        // Calling method
        sortingCSVRecordsByAColumn(filePath);
    }
}

/*6️⃣ Modify a CSV File (Update a Value)
Read a CSV file and increase the salary of employees from the "IT" department by 10%.
Save the updated records back to a new CSV file.
*/
package com.csvdatahandling.intermediateproblems.modifyacsvfileupdateavalue;

import java.io.IOException;

import static com.csvdatahandling.intermediateproblems.modifyacsvfileupdateavalue.ModifyingACSVFileAndUpdatingAValue.modifyingACSVFileAndUpdatingAValue;

public class ModifyACSVFileAndUpdateAValue {
    public static void main(String[]args) throws IOException {
        // File Path
        String filePath = "src/main/java/com/csvdatahandling/intermediateproblems/modifyacsvfileupdateavalue/employee.csv";
        // Calling method
        modifyingACSVFileAndUpdatingAValue(filePath);
    }
}

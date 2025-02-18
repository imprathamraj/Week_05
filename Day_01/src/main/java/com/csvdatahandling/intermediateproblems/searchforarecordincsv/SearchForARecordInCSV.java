/*5️⃣ Search for a Record in CSV
Read an employees.csv file and search for an employee by name.
Print their department and salary.
*/
package com.csvdatahandling.intermediateproblems.searchforarecordincsv;

import static com.csvdatahandling.intermediateproblems.searchforarecordincsv.SearchingForARecordInCSV.searchingForARecordInCSV;
import java.util.Scanner;
public class SearchForARecordInCSV {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.println("Search for an employee by name.\nEnter name - ");
        String name = input.nextLine();

        // File path
        String filePath = "src/main/java/com/csvdatahandling/intermediateproblems/searchforarecordincsv/employee.csv";
        // Method calling
        searchingForARecordInCSV(filePath,name);
    }
}

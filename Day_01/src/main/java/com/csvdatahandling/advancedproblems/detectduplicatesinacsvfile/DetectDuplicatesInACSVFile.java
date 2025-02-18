package com.csvdatahandling.advancedproblems.detectduplicatesinacsvfile;

import static com.csvdatahandling.advancedproblems.detectduplicatesinacsvfile.DetectingDuplicatesInACSVFile.detectDuplicates;

public class DetectDuplicatesInACSVFile {
    public static void main(String[] args) {
        //FilePath
        String filePath = "src/main/java/com/csvdatahandling/advancedproblems/detectduplicatesinacsvfile/file.csv";
        //Calling method
        detectDuplicates(filePath);
    }
}

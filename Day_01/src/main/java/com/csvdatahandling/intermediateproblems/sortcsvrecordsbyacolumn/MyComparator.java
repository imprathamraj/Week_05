package com.csvdatahandling.intermediateproblems.sortcsvrecordsbyacolumn;

import java.util.Comparator;

class MyComparator implements Comparator<String[]> {
    @Override
    public int compare(String[] s1, String[] s2){
        double salary1 = Double.parseDouble(s1[2]);
        double salary2 = Double.parseDouble(s2[2]);
        return Double.compare(salary1,salary2);
    }
}

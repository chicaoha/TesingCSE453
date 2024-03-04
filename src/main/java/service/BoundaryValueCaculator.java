package service;

import java.util.ArrayList;
import java.util.List;

public class BoundaryValueCaculator {
    public static List<Integer> findBVA(int max, int min){
        List<Integer> bvaValues = new ArrayList<>();
        bvaValues.add(min);
        bvaValues.add(min+1);
        bvaValues.add(max);
        bvaValues.add(max+1);
        return bvaValues;
    }

    public static List<Integer> findRBVA(int max, int min){
        List<Integer> rbvaValues = new ArrayList<>();
        rbvaValues.add(min-1);
        rbvaValues.add(min);
        rbvaValues.add(min+1);
        rbvaValues.add(max-1);
        rbvaValues.add(max);
        rbvaValues.add(max+1);
        return rbvaValues;
    }

    public static int findNominalValue(int max, int min){
        return (max+ min)/2;
    }
}

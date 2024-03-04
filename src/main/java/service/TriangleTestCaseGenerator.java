package service;

import java.util.ArrayList;
import java.util.List;

import model.TriangleClassify;

public class TriangleTestCaseGenerator {
    private static final int min = 10;
    private static final int max = 220;
    private static int nominal = BoundaryValueCaculator.findNominalValue(max, min);

    public static List<List<String>> generateBVATestCases(){
        List<Integer> bvaValues = BoundaryValueCaculator.findBVA(max, min);
        List<List<String>> list = new ArrayList<>();

        for(int i = 1; i<=3; i++){
            list.addAll(generateTestCasesForSide(bvaValues, i));
        }

        return list;
    }

    public static List<List<String>> generateRBVATestCases(){
        List<Integer> bvaValues = BoundaryValueCaculator.findRBVA(max, min);
        List<List<String>> list = new ArrayList<>();

        for(int i = 1; i<=3; i++){
            list.addAll(generateTestCasesForSide(bvaValues, i));
        }

        return list;
    }

    private static List<List<String>> generateTestCasesForSide(List<Integer> boundaryValues, int side){
        List<List<String>> list = new ArrayList<>();
        int loop = boundaryValues.size();

        for(int i=0; i<loop; i++){
            List<String> testcase = new ArrayList<>();
            for(int j=0; j<4;j++){
                if(j==3){
                    String output = calculateOutputValue(testcase);
                    testcase.add(output);
                }else if(j== (side-1)){
                    testcase.add("" + boundaryValues.get(i));
                }else{
                    testcase.add(""+nominal);
                }
            }
        }
        return list;
    }

    private static String calculateOutputValue(List<String> values){
        TriangleClassify calculator = new TriangleClassify();
        int side1 = Integer.parseInt(values.get(0));
        int side2 = Integer.parseInt(values.get(1));
        int side3 = Integer.parseInt(values.get(2));
        calculator.setSide(side1, side2, side3);
        String result = calculator.classify();
        return result;
    }
}

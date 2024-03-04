package service;

import java.util.ArrayList;
import java.util.List;

import model.CommissioningProblem;

public class ComissionTestCaseGenerator {
    private static final int min = 1;
    private static final int maxLock = 60;
    private static final int maxStock = 70;
    private static final int maxBarrel = 80;

    private static int nominalLock = BoundaryValueCaculator.findNominalValue(maxLock, min);
    private static int nominalStock = BoundaryValueCaculator.findNominalValue(maxStock, min);
    private static int nominalBarrel = BoundaryValueCaculator.findNominalValue(maxBarrel, min);

    private static List<Integer> listNominal = getNominals();

    public static List<List<String>> generateBVATestCases() {
        List<List<Integer>> bvaList = new ArrayList<>();
        bvaList.add(BoundaryValueCaculator.findBVA(maxLock, min));
        bvaList.add(BoundaryValueCaculator.findBVA(maxStock, min));
        bvaList.add(BoundaryValueCaculator.findBVA(maxBarrel, min));
        List<List<String>> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            List<Integer> bva = bvaList.get(i);
            list.addAll(generateTestCasesForSide(bva, i, listNominal.get(i)));
        }

        return list;
    }

    public static List<List<String>> generateRBVATestCases() {
        List<List<Integer>> bvaList = new ArrayList<>();
        bvaList.add(BoundaryValueCaculator.findRBVA(maxLock, min));
        bvaList.add(BoundaryValueCaculator.findRBVA(maxStock, min));
        bvaList.add(BoundaryValueCaculator.findRBVA(maxBarrel, min));
        List<List<String>> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            List<Integer> bva = bvaList.get(i);
            list.addAll(generateTestCasesForSide(bva, i, listNominal.get(i)));
        }

        return list;
    }

    private static List<Integer> getNominals() {
        List<Integer> list = new ArrayList<>();
        list.add(nominalLock);
        list.add(nominalStock);
        list.add(nominalBarrel);
        return list;
    }

    private static List<List<String>> generateTestCasesForSide(List<Integer> boundaryValues, int side, int nominal) {
        List<List<String>> list = new ArrayList<>();
        int loop = boundaryValues.size();

        for (int i = 0; i < loop; i++) {
            List<String> testcase = new ArrayList<>();

            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    String output = calculateOutputValue(testcase);
                    testcase.add(output);
                } else if (j == (side - 1)) {
                    testcase.add("" + boundaryValues.get(i));
                } else {
                    testcase.add("" + nominal);
                }
            }
        }
        return list;
    }

    private static String calculateOutputValue(List<String> values) {
        CommissioningProblem calculator = new CommissioningProblem();

        int maxLock = Integer.parseInt(values.get(0));
        int maxStock = Integer.parseInt(values.get(1));
        int maxBarrel = Integer.parseInt(values.get(2));
        calculator.setInput(maxLock, maxStock, maxBarrel);
        String result = "" + calculator.calCommission(calculator.calSale());
        return result;
    }
}

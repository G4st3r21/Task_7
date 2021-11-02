package ru.vsu.cs.PoryadinAV;

public class TestResult {
    int[][] testedArrays = new int[10][2];

    public void acceptTestedArrays(int taskNumber, int trueOrFalse) {
        testedArrays[taskNumber][0] = taskNumber;
        testedArrays[taskNumber][1] = trueOrFalse;
    }

    public int checkTestedArrays(int testNumber) {
        return testedArrays[testNumber][1];
    }
}

package ru.vsu.cs.PoryadinAV;

public class TestCase {
    private final int[] testArr;
    private final int correctPosOfFirstTerm;
    private final int correctMaxLength;

    public TestCase(int[] testArray, int correctPosOfFirstTerm, int correctMaxLength) {
        this.testArr = testArray;
        this.correctPosOfFirstTerm = correctPosOfFirstTerm;
        this.correctMaxLength = correctMaxLength;
    }

    public int[] getTestArr() {
        return testArr;
    }

    public int getCorrectPosOfFirstTerm() {
        return correctPosOfFirstTerm;
    }

    public int getCorrectMaxLength() {
        return correctMaxLength;
    }

}

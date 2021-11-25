package ru.vsu.cs.PoryadinAV;

public class TestResult {
    private final boolean isCorrect;
    private final TestCase testCase;

    public TestResult(boolean isCorrect, TestCase testCase) {
        this.isCorrect = isCorrect;
        this.testCase = testCase;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public TestCase getTestCaseNumber() {
        return testCase;
    }
}

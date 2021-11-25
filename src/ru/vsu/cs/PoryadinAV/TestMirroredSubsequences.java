package ru.vsu.cs.PoryadinAV;

import java.util.Arrays;

public class TestMirroredSubsequences {

    public TestResult[] testingCases(MirroredSubsequences testTask) {
        AllTests testingCases = new AllTests();
        TestCase[] allTests = testingCases.getAllTests();
        TestResult[] testResults = new TestResult[10];


        for (int i = 0; i < 10; i++) {
            int[] receivedAnswer = testTask.findSubSequence(allTests[i].getTestArr());
            int[] expectedAnswer = {allTests[i].getCorrectPosOfFirstTerm(), allTests[i].getCorrectMaxLength()};

            testResults[i] = new TestResult(Arrays.equals(receivedAnswer, expectedAnswer), allTests[i]);

            writeAnswer(allTests[i].getTestArr(), receivedAnswer[0], receivedAnswer[1]);
        }

        return testResults;
    }

    private static void writeAnswer(int[] array, int posOfFirstTerm, int length) {
        System.out.println("Tested array: " + Arrays.toString(array));
        System.out.println("Position of first term: " + posOfFirstTerm);
        System.out.println("Length of symmetrical subsequence: " + length + "\n");
    }
}

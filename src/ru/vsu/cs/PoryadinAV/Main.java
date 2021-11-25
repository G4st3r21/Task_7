package ru.vsu.cs.PoryadinAV;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MirroredSubsequences programLogic = new MirroredSubsequences();
        TestMirroredSubsequences testing = new TestMirroredSubsequences();
        TestResult[] testTaskResults = testing.testingCases(programLogic);

        if (checkTestedCases(testTaskResults)) {
            int[] array = ArrayUtils.readIntArrayFromConsole("array");
            int[] answer = programLogic.findSubSequence(array);

            writeAnswer(array, answer[0], answer[1]);
        }
    }

    private static boolean checkTestedCases(TestResult[] testTaskResults) {
        boolean allTestsIsDone = true;

        for (int i = 0; i < 10; i++) {
            if (!testTaskResults[i].getIsCorrect()) {
                writeError(i+1);
                allTestsIsDone = false;
                break;
            }
        }

        return allTestsIsDone;
    }

    private static void writeAnswer(int[] array, int posOfFirstTerm, int length) {
        System.out.println("Tested array: " + Arrays.toString(array));
        System.out.println("Position of first term: " + posOfFirstTerm);
        System.out.println("Length of symmetrical subsequence: " + length + "\n");
    }

    private static void writeError(int testNumber) {
        System.out.println("There is an error somewhere in code");
        System.out.println("Failed test: " + testNumber);
    }
}

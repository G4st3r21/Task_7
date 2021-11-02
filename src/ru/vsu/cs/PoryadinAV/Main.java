package ru.vsu.cs.PoryadinAV;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Task_7 testTask = new Task_7();
        TestCase testTaskCases = new TestCase();
        TestResult testTaskResults = new TestResult();

        testingCases(testTask, testTaskCases, testTaskResults);

        boolean allTestsIsDone = checkTestedCases(testTaskResults);

        checkProgram(testTask, allTestsIsDone);
    }

    private static void testingCases(Task_7 testTask, TestCase testTaskCases, TestResult testTaskResults) {
        int[][] testArrays = testTaskCases.passTestArrays();
        int[][] testAnswers = testTaskCases.passTestAnswers();

        for (int i = 0; i < 10; i++) {
            int[] test = testTask.checkSubSequence(testArrays[i]);
            int[] answer = testAnswers[i];

            if (Arrays.equals(test, answer)) {
                testTaskResults.acceptTestedArrays(i, 1);
            } else {
                testTaskResults.acceptTestedArrays(i, 0);
            }

            writeAnswer(testArrays[i], test[0], test[1]);
        }
    }

    private static boolean checkTestedCases(TestResult testTaskResults) {
        boolean allTestsIsDone = true;

        for (int i = 0; i < 10; i++) {
            if (testTaskResults.checkTestedArrays(i) == 0) {
                writeError(i + 1);
                allTestsIsDone = false;
                break;
            }
        }

        return allTestsIsDone;
    }

    private static void checkProgram(Task_7 testTask, boolean allTestsIsDone) {
        if (allTestsIsDone) {
            int[] array = ArrayUtils.readIntArrayFromConsole("array");
            int[] answer = testTask.checkSubSequence(array);
            writeAnswer(array, answer[0], answer[1]);
        }
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

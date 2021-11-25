package ru.vsu.cs.PoryadinAV;

public class AllTests {

    public TestCase[] getAllTests() {
        TestCase testCase1 = new TestCase(new int[]{5, 1, 3, 1, 3, 5, 1, 5, 3, 7, 8, 8, 9, 8, 8, 5, 1},
                4, 5);
        TestCase testCase2 = new TestCase(new int[]{1, 1}, 0, 2);
        TestCase testCase3 = new TestCase(new int[]{}, 0, 0);
        TestCase testCase4 = new TestCase(new int[]{3, 3, 3}, 0, 3);
        TestCase testCase5 = new TestCase(new int[]{1, 2, 2, 1, 5, 1, 2, 2, 1}, 0, 9);
        TestCase testCase6 = new TestCase(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                0, 11);
        TestCase testCase7 = new TestCase(new int[]{7}, 0, 0);
        TestCase testCase8 = new TestCase(new int[]{1, 1, 2, 2, 1, 1}, 0, 6);
        TestCase testCase9 = new TestCase(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2},
                0, 11);
        TestCase testCase10 = new TestCase(new int[]{2, 3, 1, 0, 5, 0, 1, 3, 2}, 0, 9);

        return new TestCase[]{testCase1, testCase2, testCase3, testCase4, testCase5,
                testCase6, testCase6, testCase7, testCase8, testCase9, testCase10};
    }

}

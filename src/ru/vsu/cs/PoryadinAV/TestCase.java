package ru.vsu.cs.PoryadinAV;

public class TestCase {

    public int[][] passTestArrays() {
        int[][] tests = {
                {5, 1, 3, 1, 3, 5, 1, 5, 3, 7, 8, 8, 9, 8, 8, 5, 1},
                {1, 1},
                {},
                {3, 3, 3},
                {1, 2, 2, 1, 5, 1, 2, 2, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {7},
                {1, 1, 2, 2, 1, 1},
                {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2},
                {2, 3, 1, 0, 5, 0, 1, 3, 2}
        };

        return tests;
    }

    public int[][] passTestAnswers() {
        int[][] testAnswers = {
                {4, 5},
                {0, 2},
                {0, 0},
                {0, 3},
                {0, 9},
                {0, 11},
                {0, 0},
                {0, 6},
                {0, 11},
                {0, 9}
        };

        return testAnswers;
    }
}

package ru.vsu.cs.PoryadinAV;

import java.util.Arrays;

public class Task_7 {

    public int[] checkSubSequence(int[] array) {
        int maxLength = 0;
        int posOfFirstTerm = 0;
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - i; j++) {
                int[] subSequence = takeSubSequenceFromArray(i, j, array);
                if (checkSymmetricalSubSequence(subSequence) && subSequence.length > maxLength) {
                    maxLength = subSequence.length;
                    posOfFirstTerm = i;
                }
            }
        }

        answer[0] = posOfFirstTerm;
        answer[1] = maxLength;

        return answer;
    }

    private int[] takeSubSequenceFromArray(int start, int end, int[] array) {
        int length = end - start + 1;
        int[] subSequence = new int[length];

        System.arraycopy(array, start, subSequence, 0, length);

        return subSequence;
    }

    private boolean checkSymmetricalSubSequence(int[] subSequence) {
        int halfLength = subSequence.length / 2;
        int[] firstHalf = new int[halfLength];
        int[] secondHalf = new int[halfLength];

        System.arraycopy(subSequence, 0, firstHalf, 0, halfLength);

        int temp;
        for (int i = 0; i < halfLength; i++) {
            temp = subSequence[i];
            subSequence[i] = subSequence[subSequence.length - i - 1];
            subSequence[subSequence.length - i - 1] = temp;
        }

        System.arraycopy(subSequence, 0, secondHalf, 0, halfLength);

        return Arrays.equals(firstHalf, secondHalf);
    }
}

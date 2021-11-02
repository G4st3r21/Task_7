package ru.vsu.cs.PoryadinAV;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class ArrayUtils {

    public static int[] readIntArrayFromConsole(String arrName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                if (arrName == null || arrName.length() == 0) {
                    arrName = "";
                } else {
                    arrName = " " + arrName;
                }
                System.out.printf("Введите массив%s:%n", arrName);
                String line = scanner.nextLine();
                return toIntArray(line);
            }
            catch(Exception e) {
                System.out.print("Вы ошиблись, попробуйте еще раз! ");
            }
        }
    }

    public static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        // из List<Integer> можно получить Integer[]
        Integer[] arr = list.toArray(new Integer[0]);
        // Integer[] -> int[]
        return ArrayUtils.toPrimitive(arr);
    }

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // автоматическая распаковка из объекта
            result[i] = arr[i];
        }
        return result;
    }

}

package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        MinDiapason minI = new MinDiapason();
        FindLoop index = new FindLoop();
        for (int i = 0; i < data.length; ++i) {
            int tmp = data[i];
            int dataMin = minI.find(data, i, data.length - 1);
            int indexMin = index.index1(data, dataMin);
            data[i] = dataMin;
            data[indexMin] = tmp;
        }
        return data;
    }
}

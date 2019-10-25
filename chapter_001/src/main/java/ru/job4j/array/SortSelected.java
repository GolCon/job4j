package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        for (int i=0; i<data.length; ++i) {
            int tmp = data[i];

            MinDiapason minI = new MinDiapason();
            int dataMin = minI.findMin(data, i, data.length-1);
            FindLoop index = new FindLoop();
            int indexMin = index.indexOf(data, dataMin);
            data[i] = dataMin;



            data[indexMin] = tmp;
           // start=start+1;
        }
        return data;
    }
}

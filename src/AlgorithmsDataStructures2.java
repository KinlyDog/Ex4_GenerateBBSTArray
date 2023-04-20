import java.util.*;

public class AlgorithmsDataStructures2 {
    public static int[] GenerateBBSTArray(int[] a) {
        int[] sort = Arrays.copyOf(a, a.length);
        Arrays.sort(sort);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : sort) {
            list.add(0, i);
        }

        GenerateBBSTArrayRec(sort.length - 1, sort, list);

        return sort;
    }

    private static void GenerateBBSTArrayRec(int i, int[] sort, ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return;
        }

        for (int t = 0; t < list.size(); t++) {
            sort[i--] = list.remove(t);
        }

        GenerateBBSTArrayRec(i, sort, list);
    }
}
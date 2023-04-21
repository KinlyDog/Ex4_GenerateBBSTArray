import java.util.*;

public class AlgorithmsDataStructures2 {
    public static int[] GenerateBBSTArray(int[] a) {
        Arrays.sort(a);
        int[] result = new int[a.length];

        GenerateBBSTArrayRec(a, 0, a.length - 1, result, 0);
        return result;
    }

    private static void GenerateBBSTArrayRec(int[] sort, int start, int end, int[] result, int i) {
        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;
        result[i] = sort[mid];

        GenerateBBSTArrayRec(sort, start, mid - 1, result, 2 * i + 1);
        GenerateBBSTArrayRec(sort, mid + 1, end, result, 2 * i + 2);
    }
}
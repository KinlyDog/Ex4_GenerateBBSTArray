import java.util.*;

public class AlgorithmsDataStructures2 {
    public static int[] GenerateBBSTArray(int[] a) {
        Arrays.sort(a);
        int[] result = new int[a.length];

        GenerateBBSTArrayRec(a, 0, a.length - 1, result, 0);
        return result;
    }

    private static void GenerateBBSTArrayRec(int[] sort, int startIndex, int endIndex, int[] result, int i) {
        if (startIndex > endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        result[i] = sort[mid];

        GenerateBBSTArrayRec(sort, startIndex, mid - 1, result, 2 * i + 1);
        GenerateBBSTArrayRec(sort, mid + 1, endIndex, result, 2 * i + 2);
    }
}
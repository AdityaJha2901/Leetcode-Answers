import java.util.Arrays;

public class Solution {
    public int countTriplets(int[] arr) {
        int ans = 0;
        int[] xors = new int[arr.length + 1];
        int prefix = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix ^= arr[i];
            xors[i + 1] = prefix;
        }

        for (int j = 1; j < arr.length; j++) {
            int xors_j = xors[j];
            for (int i = 0; i < j; i++) {
                int xors_i = xors_j ^ xors[i];
                for (int k = j; k < arr.length; k++) {
                    int xors_k = xors[k + 1] ^ xors_j;
                    if (xors_i == xors_k) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
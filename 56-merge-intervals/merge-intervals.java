import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> res = new ArrayList<>();
        int[] curr = intervals[0];

        for(int[] in : intervals) {
            if(in[0] <= curr[1]) {
                curr[1] = Math.max(curr[1], in[1]);
            } else {
                res.add(curr);
                curr = in;
            }
        }
        res.add(curr);

        return res.toArray(new int[res.size()][]);
    }
}
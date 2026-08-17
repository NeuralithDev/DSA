class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
        int n = intervals.length;
        int lastidx = intervals[0][1];
        int c = 1;
        for(int i = 1 ; i < n; i++) {
            if(intervals[i][0] >= lastidx){
                c++;
                lastidx = intervals[i][1];
            }
        }
        return n-c;
    }
}
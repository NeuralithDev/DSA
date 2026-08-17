class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[1]));
        int lastidx = intervals[0][1];
        int c = 0;
        for(int i = 1 ; i < intervals.length; i++) {
            if(intervals[i][0] < lastidx){
                c++;
                
            }else{
                lastidx = intervals[i][1];
            }
        }
        return c;
    }
}
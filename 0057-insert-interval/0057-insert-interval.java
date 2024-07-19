class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> r=new LinkedList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            r.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        r.add(newInterval);
        while(i<intervals.length){
            r.add(intervals[i]);
            i++;
        }
        return r.toArray(new int[r.size()][2]);
    }
}
/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) -> Integer.compare(a.start,b.start));
        PriorityQueue<Interval> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.end, b.end));
        for(Interval i:intervals){
            if(pq.size() == 0)  pq.add(i);
            else{
                Interval top = pq.peek();
                if(top.end <= i.start){
                    pq.poll();
                }
                pq.add(i);
            }
        }
        return pq.size();
    }
}

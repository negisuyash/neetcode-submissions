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
        Collections.sort(intervals, (p1,p2) -> p1.start - p2.start);
        PriorityQueue<Interval> pq = new PriorityQueue<>((p1,p2) -> p1.end - p2.end);
        for(Interval i:intervals){
            if(!pq.isEmpty() && pq.peek().end <= i.start){
                pq.poll();
            }
            pq.add(i);
        }
        return pq.size();
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question56 {
     static class Interval {
         int start;
         int end;
         Interval() { start = 0; end = 0; }
         Interval(int s, int e) { start = s; end = e; }
     }
    public static List<Interval> merge(List<Interval> intervals) {
         //use start as prior-key
        intervals.sort((i1,i2)->Integer.compare(i1.start, i2.start));
        List<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval i: intervals){
            if (i.start <= end){
                //merge the interval;
                end = Math.max(end, i.end);
            }
            else {
                //add interval to list, update start and end;
                res.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }
        // add the last
        res.add(new Interval(start, end));
        return res;
    }
    public static void main(String[] arg) {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(2, 6));
        input.add(new Interval(8, 10));
        input.add(new Interval(15, 18));
        List<Interval> ans = new ArrayList<>();
        ans = merge(input);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("["+ ans.get(i).start+","+ans.get(i).end + "]");
        }
    }
}

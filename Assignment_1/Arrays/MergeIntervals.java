/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
[1,2],[3,5],[6,7],[8,10],[12,16]
[4,9]
[1,2],[3,10],[12,16]

1,2
3,10,
12,16

1 3  8 12
2 5  10 16
6,7

[1,2],[3,5],[8,10],[12,16
[6,7]

1,2
3,5
6,7

 public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
         ArrayList<Integer> s = new ArrayList<Integer>();
        ArrayList<Integer> e =  new ArrayList<Integer>();
        for(int i = 0;i<intervals.size();i++){
            s.add(intervals.get(i).start);
            e.add(intervals.get(i).end);
        }

        insertElement(s,newInterval.start);
        insertElement(e,newInterval.end);

        ArrayList<Integer> m = new ArrayList<Integer>();

        int i = 0;
        boolean isStart = true;
        while(i<s.size()){
            if(isStart){
                isStart = false;
                if(m.size()!= 0 && s.get(i)<=m.get(m.size()-1))
                {
                    m.remove(m.size()-1);
                   continue; 
                }
                
                m.add(s.get(i));
                
            }else{
                m.add(e.get(i));
                isStart = true;
                i++;
            }
        }

        ArrayList<Interval> res = new ArrayList<Interval>();

        for(int k = 0;k<m.size();k+=2){
            Interval inter = new Interval(m.get(k),m.get(k+1));
            res.add(inter);
        }

        return res;

    }

    public void insertElement(ArrayList<Integer> l,int num){
        for(int i = 0;i<l.size();i++){
            if(l.get(i)>num){
                l.add(i,num);
                return;
            }
        }
        l.add(num);
        return;
    }
}
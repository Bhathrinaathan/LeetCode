import java.util.*;
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> notLost=new HashSet<>();
        HashSet<Integer> lostOnce=new HashSet<>();
        HashSet<Integer> lost=new HashSet<>();
        int flag=0;
        for (int i=0;i<matches.length;i++)
        {
            if (!lostOnce.contains(matches[i][0]) && !lost.contains(matches[i][0]))
                notLost.add(matches[i][0]);
            
            if (notLost.contains(matches[i][1]))
            {
                notLost.remove(matches[i][1]);
                lostOnce.add(matches[i][1]);
            }
            else if (lostOnce.contains(matches[i][1]))
            {
                lostOnce.remove(matches[i][1]);
                lost.add(matches[i][1]);
            }
            else if(lost.contains(matches[i][1]))
            {}
            else
                lostOnce.add(matches[i][1]);
        }
        ans.add(new ArrayList<Integer>(notLost));
        ans.add(new ArrayList<Integer>(lostOnce));
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}

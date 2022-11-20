//Uses Jarvis Algorithm

class Solution {
    public int orientation(int[] p,int[] q,int[] r)
    {
        //  Difference of the slope of pq and qr
        //  Negative -> Anticlockwise
        //  Zero -> In straight line
        //  Positive -> Clockwise
        return (q[0]-r[0])*(p[1]-q[1])-(q[1]-r[1])*(p[0]-q[0]);
    }
    
    public boolean inSegment(int[] p,int[] i,int[] q)
    {
        //To check if they are in same line
        boolean xCoord=(i[0]>=p[0] && i[0]<=q[0]) || (i[0]<=p[0] && i[0]>=q[0]);
        boolean yCoord=(i[1]>=p[1] && i[1]<=q[1]) || (i[0]<=p[1] && i[1]>=q[1]);
        return xCoord&&yCoord;
    }
    
    public int[][] outerTrees(int[][] trees) {
        HashSet<int[]> outer=new HashSet<>();
        int bottomLeft=0;
        for  (int i=0;i<trees.length;i++)
        {
            if (trees[i][0]<trees[bottomLeft][0])
                bottomLeft=i;
        }
        int p=bottomLeft,q,limit=trees.length;
        do
        {
            q=(p+1)%trees.length;
            for  (int i=0;i<trees.length;i++)
            {
                if (orientation(trees[p],trees[i],trees[q])<0)
                    q=i;
            }
            for (int i=0;i<trees.length;i++)
            {
                if (i!=p && i!=q && inSegment(trees[p],trees[i],trees[q]) && orientation(trees[p],trees[i],trees[q])==0)
                    outer.add(trees[i]);
            }
            outer.add(trees[q]);
            p=q;
        }
        while(p!=bottomLeft && limit-->0);
        return outer.toArray(new int[outer.size()][]);
    }
}

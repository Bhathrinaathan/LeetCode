class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int key: arr)
        {
            if (map.containsKey(key))
                map.replace(key,map.get(key)+1);
            else
                map.put(key,1);
        }
        HashSet<Integer> set=new HashSet<>();
        for (Map.Entry m: map.entrySet())
        {
            if (!set.add((int)m.getValue()))
                return false;
        }
        return true;
    }
}

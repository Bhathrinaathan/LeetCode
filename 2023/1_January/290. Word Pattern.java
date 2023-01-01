class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        Scanner sc=new Scanner(s);
        sc.useDelimiter(" ");
        int i=0;
        while(sc.hasNext() && i<pattern.length())
        {   
            String curr=sc.next().toString();
            if (map.containsKey(pattern.charAt(i)) || map.containsValue(curr))
            {
                String val=map.get(pattern.charAt(i));
                if (!curr.equals(val))
                return false;                
            }
            else
                map.put(pattern.charAt(i),curr);
            System.out.println(map);
            i++;
        }
        if ((i==pattern.length() && sc.hasNext()) || (i!=pattern.length()))
            return false;
        return true;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            if (map.containsKey(s.charAt(i)))
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            map.putIfAbsent(s.charAt(i),1);
        }
        List<Character> ch=new ArrayList<>(map.keySet());
        Collections.sort(ch,(a,b)->(map.get(b)-map.get(a)));
        StringBuilder sb=new StringBuilder();
        for (Character c:ch)
        {
            for(int i=0;i<map.get(c);i++)
                sb.append(c);
        }
        return sb.toString();
    }
}

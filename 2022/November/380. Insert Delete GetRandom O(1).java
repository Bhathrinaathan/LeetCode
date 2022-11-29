class RandomizedSet {
    
    HashSet<Integer> set;
    public RandomizedSet() {
        set=new HashSet<Integer>();    
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        Integer[] arr=set.toArray(new Integer[set.size()]);
        Random rn=new Random();
        return arr[rn.nextInt(set.size())];
    }
}

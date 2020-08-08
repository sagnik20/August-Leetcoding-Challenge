class MyHashSet {
    
    boolean a[];

    /** Initialize your data structure here. */
    public MyHashSet() {
        a=new boolean[1000001];
    }
    
    public void add(int key) {
        a[key] = true;
    }
    
    public void remove(int key) {
        a[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return a[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

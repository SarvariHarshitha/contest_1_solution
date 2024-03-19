//Created an arraylist to store the pinged requests.

class RecentCounter {
    int count;
    ArrayList<Integer> a=new ArrayList<>();

    public RecentCounter() {
        this.count=0;
        
    }
    
    public int ping(int t) {
        count=0;
        a.add(t);
        for(int i=0;i<a.size();i++){
            if(a.get(i)>=(t-3000)) count++;

        }


        return count;

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

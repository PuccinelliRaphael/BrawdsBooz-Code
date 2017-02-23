package pizza_test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EndPoint {
    private Map<Integer, Integer> caches = new HashMap<Integer, Integer>();
    private int totLatency;
    private int latencyToSource;
    
    public EndPoint(int latencyToSource) {
    	this.latencyToSource = latencyToSource;
    }
    
    public void addCaches(int id, int latency){
    	totLatency += latency;
        this.caches.put(id, latency);
    }

    public Map getCaches(){
        return this.caches;
    }
    
    public int getTotalLatency() {
    	return totLatency;
    }
    
    public String toString() {
    	return caches.toString() + " : TOT: " + totLatency;
    }
}

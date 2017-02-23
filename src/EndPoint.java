package pizza_test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EndPoint {
    private Map<Integer, Integer> caches = new HashMap<Integer, Integer>();
    private List<Integer> totLatency;
    private int latencyToSource;
    
    public EndPoint(int latencyToSource) {
    	this.latencyToSource = latencyToSource;
    	totLatency = new LinkedList<Integer>();
    }
    
    public void addCaches(int id, int latency){
        this.caches.put(id, latency);
    }

    public Map getCaches(){
        return this.caches;
    }
    
    public void addLatency(int latency) {
    	totLatency.add(latency);
    }
    
    public void calcLatency() {
    	
    	int total = 0;
    	
    	for (int i = 0; i < caches.size(); i++) {
    		total += caches.get(i);
    	}
    }
    
    public String toString() {
    	return caches.toString();
    }
}

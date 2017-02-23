import java.util.HashMap;
import java.util.Map;

public class EndPoint {
    private Map caches = new HashMap();

    public void addCaches(int id, int latency){
        this.caches.put(id, latency);
    }

    public Map getCaches(){
        return this.caches;
    }

}

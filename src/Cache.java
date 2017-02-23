
public class Cache {
    private int MAX_SIZE;
    private int USED_SIZE = 0;

    public void setMAX_SIZE(int size){
        this.MAX_SIZE = size;
    }

    public void addUsed(int mb){
        this.USED_SIZE += mb;
    }

    public void release(int mb){
        this.USED_SIZE -= mb;
    }
}

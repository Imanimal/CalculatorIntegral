package mainPackages;

import java.io.Serializable;
import java.util.LinkedList;

public class CollectionSerrializable implements Serializable {
    private LinkedList<RecIntegral> collection;

    public CollectionSerrializable(LinkedList<RecIntegral> newCollection) {
        collection = newCollection;
    }
    
    public void setCollection(LinkedList<RecIntegral> newCollection)
    {
        collection = newCollection;
    }
    
    public LinkedList<RecIntegral> getCollection()
    {
        return collection;
    }
    
}

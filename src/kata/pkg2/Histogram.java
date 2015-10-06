
package kata.pkg2;

import java.util.HashMap;

public class Histogram <T> {
    private final T[] result;

    public Histogram(T[] result) {
        this.result = result;
    }

    public T[] getResult() {
        return result;
    }
    
    public HashMap<T,Integer> getHisto(){
        
        HashMap<T,Integer> histo= new HashMap<>();
        
        for(int i=0; i<result.length;i++){
            if(!histo.containsKey(result[i])){
                histo.put(result[i], 0);
                
            }
            histo.put(result[i], histo.get(result[i])+1);
        }
        return histo;
    }
    
}

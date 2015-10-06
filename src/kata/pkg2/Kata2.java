
package kata.pkg2;

import java.util.HashMap;

public class Kata2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,1,2,6,3,5};
        String[] array1= {"Juan","Iraida","Gabriel","Iraida","Alvaro","Juande",""};
        
        Histogram histog = new Histogram(array);
        
        HashMap <Integer,Integer> histograma = histog.getHisto();
              
        for(Integer key : histograma.keySet()){
            System.out.println(key+" : "+ histograma.get(key));
            
        }        
                
    }
}

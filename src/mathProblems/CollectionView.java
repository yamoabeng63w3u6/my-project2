package mathProblems;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Boston");
        map.put(4, "Seattle");
        map.put(5, "Jersey City");

        for (Map.Entry<Integer, String> USA : map.entrySet()) {
            System.out.println("Collection view is -" + USA.getKey() + " : " + USA.getValue());
        }
    }


}


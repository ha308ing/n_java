// HashMap and Iterator

// import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;

public class Goods {
    public static void main(String[] args) {
        /*
         * HashMap<String, Integer> goods = new HashMap<String, Integer>();
         * 
         * goods.put("bread", 2);
         * goods.put("milk", 3);
         * goods.put("flowers", 3);
         * goods.put("tomatoes", 5);
         * 
         */

        HashSet<String> goods = new HashSet<String>();

        goods.add("bread");
        goods.add("milk");
        goods.add("flowers");
        goods.add("tomatoes");
        goods.add("banana");

        System.out.println(goods);

        goods.remove("milk");

        Iterator<String> it = goods.iterator();
        while (it.hasNext()) {
            String good = it.next();
            if (good == "bread")
                it.remove();
            System.out.println(good);
        }

        System.out.println(goods);
    }
}

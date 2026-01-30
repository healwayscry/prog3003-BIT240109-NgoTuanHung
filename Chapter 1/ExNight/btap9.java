import java.util.TreeMap;
import java.util.Map;

class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println("Danh sach san pham: " + products);

        Map<String, Double> subProducts =
                products.subMap("K", true, "M", true);

        System.out.println("san pham tu K den M: " + subProducts);
    }
}

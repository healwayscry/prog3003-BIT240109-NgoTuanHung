import java.util.ArrayList;

class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");         
        fruits.set(fruits.indexOf("Banana"), "Grapes");

        System.out.println("Danh sách: " + fruits);
        System.out.println("Có Apple không? " + fruits.contains("Apple"));
    }
}

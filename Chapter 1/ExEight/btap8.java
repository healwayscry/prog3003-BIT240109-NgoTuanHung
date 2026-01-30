import java.util.HashMap;

class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        System.out.println("ID 102: " + employees.get(102));

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println("Danh sach nhan vien: " + employees);
    }
}

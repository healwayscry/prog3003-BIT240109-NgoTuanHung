import java.util.HashSet;

class HashSetTest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 5, 8, 1};

        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        System.out.println("Cac phan tu duy nhat: " + set);
    }
}

// Giải thích: Vì HashSet lưu trữ phần tử dựa trên hàm băm (hash), nên không đảm bảo thứ tự thêm vào.
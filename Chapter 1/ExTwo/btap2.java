class PrintArrayTest {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"hung", "hungg", "hunggg"};

        printArray(intArr);
        printArray(strArr);
    }
}

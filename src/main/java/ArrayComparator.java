public class ArrayComparator {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == null || array2[i] == null || !array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Примеры использования метода compareArrays()

        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println("Массивы intArray1 и intArray2 одинаковые: " + compareArrays(intArray1, intArray2));

        String[] strArray1 = {"apple", "banana", "orange"};
        String[] strArray2 = {"apple", "banana", "orange"};
        System.out.println("Массивы strArray1 и strArray2 одинаковые: " + compareArrays(strArray1, strArray2));

        Double[] doubleArray1 = {1.5, 2.0, 3.7};
        Double[] doubleArray2 = {1.5, 2.0, 3.7};
        System.out.println("Массивы doubleArray1 и doubleArray2 одинаковые: " + compareArrays(doubleArray1, doubleArray2));

        // Массивы разной длины
        Character[] charArray1 = {'a', 'b', 'c'};
        Character[] charArray2 = {'a', 'b', 'c', 'd'};
        System.out.println("Массивы charArray1 и charArray2 одинаковые: " + compareArrays(charArray1, charArray2));
    }
}

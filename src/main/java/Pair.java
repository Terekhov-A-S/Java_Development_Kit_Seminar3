public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        // Пример использования класса Pair
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        Pair<Double, Character> pair2 = new Pair<>(3.14, 'A');

        System.out.println("Pair 1: " + pair1);
        System.out.println("First element of Pair 1: " + pair1.getFirst());
        System.out.println("Second element of Pair 1: " + pair1.getSecond());

        System.out.println("\nPair 2: " + pair2);
        System.out.println("First element of Pair 2: " + pair2.getFirst());
        System.out.println("Second element of Pair 2: " + pair2.getSecond());
    }
}


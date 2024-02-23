public class Main {

    public static void main(String[] args) {
        // Примеры использования калькулятора

        // Сложение
        System.out.println("Сумма: " + Calculator.sum(5, 3.5));

        // Умножение
        System.out.println("Произведение: " + Calculator.multiply(4, 2.5));

        // Деление
        try {
            System.out.println("Частное: " + Calculator.divide(10, 2));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении: " + e.getMessage());
        }

        // Вычитание
        System.out.println("Разность: " + Calculator.subtract(8.5, 3));
    }
    
}

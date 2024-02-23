public class Calculator {

    public static <T extends Number> T sum(T operand1, T operand2) {
        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() + operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() + operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) Float.valueOf(operand1.floatValue() + operand2.floatValue());
        } else if (operand1 instanceof Long) {
            return (T) Long.valueOf(operand1.longValue() + operand2.longValue());
        } else {
            throw new IllegalArgumentException("Недопустимый тип числа");
        }
    }

    public static <T extends Number> T multiply(T operand1, T operand2) {
        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() * operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() * operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) Float.valueOf(operand1.floatValue() * operand2.floatValue());
        } else if (operand1 instanceof Long) {
            return (T) Long.valueOf(operand1.longValue() * operand2.longValue());
        } else {
            throw new IllegalArgumentException("Недопустимый тип числа");
        }
    }

    public static <T extends Number> T divide(T operand1, T operand2) {
        if (operand2.doubleValue() == 0.0) {
            throw new ArithmeticException("Деление на 0 запрещено");
        }

        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() / operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() / operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) Float.valueOf(operand1.floatValue() / operand2.floatValue());
        } else if (operand1 instanceof Long) {
            return (T) Long.valueOf(operand1.longValue() / operand2.longValue());
        } else {
            throw new IllegalArgumentException("Недопустимый тип числа");
        }
    }

    public static <T extends Number> T subtract(T operand1, T operand2) {
        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() - operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() - operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) Float.valueOf(operand1.floatValue() - operand2.floatValue());
        } else if (operand1 instanceof Long) {
            return (T) Long.valueOf(operand1.longValue() - operand2.longValue());
        } else {
            throw new IllegalArgumentException("Недопустимый тип числа");
        }
    }
}

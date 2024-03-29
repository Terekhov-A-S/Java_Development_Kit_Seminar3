# Java Development Kit (семинары)

![picture for project](https://raw.githubusercontent.com/Terekhov-A-S/Java_Development_Kit_Seminar3/main/src/main/resources/1-g6ryqrum8c3a29s7omihcg.jpeg)

## Урок 3. Обобщенное программирование


### Задача.

1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). 
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. 
Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. 
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, 
а также переопределение метода toString(), возвращающее строковое представление пары.

#### Решение

[**Класс калькулятор.**](https://github.com/Terekhov-A-S/Java_Development_Kit_Seminar3/blob/main/src/main/java/Main.java)

<details>

  <summary>Нажмите, чтобы открыть код</summary>

```java
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
}
    
```

</details>

В данном коде используется ограничение <T extends Number>, чтобы указать, что типы параметров должны быть подтипами Number. 
Методы sum(), multiply(), divide(), и subtract() выполняют соответствующие арифметические операции для различных числовых типов 
(Integer, Double, Float, Long).

[**Класс ArrayComparator**](https://github.com/Terekhov-A-S/Java_Development_Kit_Seminar3/blob/main/src/main/java/ArrayComparator.java)

<details>

  <summary>Нажмите, чтобы открыть код</summary>

```java
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
    
```

</details>

Этот код использует обобщенный метод compareArrays(), который принимает два массива любого типа (T) и возвращает true, 
если массивы одинаковые, и false в противном случае. Для обобщенных типов T следует использовать метод equals 
для сравнения значений, и также мы добавили проверку на null. Примеры использования данного метода для массивов различных типов данных 
представлены в методе main().



[**Класс Pair**](https://github.com/Terekhov-A-S/Java_Development_Kit_Seminar3/blob/main/src/main/java/ArrayComparator.java)

<details>

  <summary>Нажмите, чтобы открыть код</summary>

```java
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
    
```

</details>

Этот класс Pair представляет собой пару значений разного типа (T и U). У класса есть конструктор, методы getFirst() и getSecond() 
для получения значений пары, и переопределенный метод toString(), возвращающий строковое представление пары. 
Пример использования класса Pair также представлен в методе main().


---


*Подготовил студент Geek Brains* [**`Терехов Александр`**](https://gb.ru/users/1db43d0f-6c3d-46d1-bf5e-974b49af6f0d), Java_Development_Kit_Seminar3


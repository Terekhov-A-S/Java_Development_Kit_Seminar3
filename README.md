# Java Development Kit (семинары)

![picture for project](https://github.com/Terekhov-A-S/Java_Development_Kit_Seminar2/blob/main/src/resources/d00d9980-6133-11ea-96b1-d299da7c5c7f.png)

## Урок 3. Обобщенное программирование

[Перейти в папку src](https://github.com/Terekhov-A-S/Java_Development_Kit_Seminar2/tree/main/src)


### Задача.

1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). 
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. 
Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. 
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, 
а также переопределение метода toString(), возвращающее строковое представление пары.

#### Решение

Класс калькулятор.

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




---


*Подготовил студент Geek Brains* [**`Терехов Александр`**](https://gb.ru/users/1db43d0f-6c3d-46d1-bf5e-974b49af6f0d), Java_Development_Kit_Seminar3
# Java_Development_Kit_Seminar3
# Java_Development_Kit_Seminar3

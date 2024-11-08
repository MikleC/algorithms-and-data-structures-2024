package ru.mirea.practice.s23f0011.task1;

public class Exception2 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}

/*
- При делении чисел с плавающей точкой (double) на ноль Java не генерирует исключение ArithmeticException.
- Вместо этого она возвращает Infinity для результата деления и NaN (Not a Number) для результата деления нуля на ноль.

Добавление блока try-catch:
- Блок try-catch позволяет перехватить исключения и обработать их в ручном режиме.
- В блоке try находится код, который может вызвать исключение.
- В блоке catch находится код, который выполняется, если в блоке try возникло исключение указанного типа.

Поведение программы:
- В случае деления на ноль в блоке try выполняется код из блока catch, который выводит сообщение "Attempted division by zero".
- Программа не прекращает работу с сообщением об ошибке.

Объяснение:
- Блок try-catch позволяет программе обработать исключения и продолжить выполнение.
- В данном случае программа не прекращает работу, а выводит сообщение о попытке деления на ноль.
 */

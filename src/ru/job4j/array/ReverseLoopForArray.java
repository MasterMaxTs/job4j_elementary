package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Текущий элемент массива начиная с последнего: "
                    + numbers[numbers.length - 1 - i]);
            if ((numbers.length - 1 - i) % 2 == 0) {
                System.out.println("Текущее значение элемента массива с чётным "
                        + "индексом начиная с последнего: "
                        + numbers[numbers.length - 1 - i]);
            }
        }
    }
}


package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        /**
         * array = array - запись не допустима, т.к. компилятор обработает
         * данную переменную как локальную, и ссылочная переменная замкнётся сама на себя.
         * Таким образом, в метод print() будет передан пустой массив.
         */
        this.array = array;               /** обращение к переменной объекта при вызове метода  */
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }

}

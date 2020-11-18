package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            return "Привет, умник.";
        } else if ("Пока".equals(question)) {
            return "До скорой встречи.";
        } else {
            return rsl;
        }
    }

    public static void main(String[] args) {
        System.out.println("Вы ввели: \"Привет, Бот.\"");
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);

        System.out.println("Вы ввели: \"Пока\"");
        rsl = DummyBot.answer("Пока");
        System.out.println(rsl);

        System.out.println("Вы ввели: \"Как дела?\"");
        rsl = DummyBot.answer("Как дела?");
        System.out.println(rsl);

    }
}

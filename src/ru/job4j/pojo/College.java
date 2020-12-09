package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Maxim");
        student.setSurname("Ivanov");
        student.setMiddleName("Nikolaevish");
        student.setGroup(63);
        student.setDate("21.08.2001");
        System.out.println("Student: " + student.getName() + " " + student.getMiddleName()
                + " " + student.getSurname() + ". Group - " + student.getGroup()
                + ". Date of admission to the University - " + student.getDate());
    }
}

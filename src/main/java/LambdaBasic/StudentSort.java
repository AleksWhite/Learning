package LambdaBasic;

import java.util.ArrayList;
import java.util.Collections;
/*
Сортировка студентов по убыванию по возрасту
* */
public class StudentSort {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
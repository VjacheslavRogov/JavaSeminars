package classwork;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    // Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
    // Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
    public static void main(String[] args) {
        List<Student> students = create();

        for (int i = 0; i < students.size(); i++) {
            int sumMarks = 0;

            for (int mark : students.get(i).getMarks()) {
                sumMarks += mark;
            }
            if (students.get(i).getSurName().endsWith("ова") && sumMarks % 2 == 0) {
                System.out.println(students.get(i).getSalary());
            }
        }
    }

    public static List<Student> create() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", 1, 10_000, List.of(3, 4, 5)));
        students.add(new Student("Гаврилова", 2, 20_000, List.of(4, 5, 5)));
        students.add(new Student("Соболев", 3, 15_000, List.of(2, 4, 2)));
        students.add(new Student("Матросова", 4, 5_000, List.of(3, 4, 3)));

        return students;
    }
}

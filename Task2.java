import java.util.ArrayList;
import java.util.List;

public class Task2 {
//    1. Создать коллекцию класса ArrayList со значениями имен всех студентов в группе. С помощью Stream'ов:
//    2. - Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
//    3. - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Валерия", "Денис", "Глеб", "Ольга", "Роман", "Ольга", "Даниил",
                "Александр", "Елизавета", "Святослав", "Яна", "Мария", "Дмитрий", "Ирина", "Александр", "Даниил", "Юлия"));
        System.out.println("1: " + names);

        String myName = "Ирина";
        System.out.println("2: " + names.stream()
                .filter(myName::equalsIgnoreCase)
                .count());

        System.out.println("3: " + names.stream()
                .filter(s -> s.regionMatches(true, 0, "а", 0, 1))
                .toList());
    }
}

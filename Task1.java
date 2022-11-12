import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
//    1. Создать коллекцию класса ArrayList наполнить ее рандомными элементами типа Integer. С помощью Stream'ов:
//    2. - Удалить дубликаты
//    3. - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
//    4. - Каждый элемент умножить на 2
//    5. - Отсортировать и вывести на экран первых 4 элемента
//    6. - Вывести количество элементов в стриме
//    7. - Вывести среднее арифметическое всех чисел в стриме

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 15) {
            list.add(new Random().nextInt(35));
        }
        System.out.println("1: " + list);

        System.out.println("2: " + list.stream()
                .distinct()
                .toList());

        System.out.println("3: " + list.stream()
                .filter(s -> (s % 2 == 0) && (s >= 7) && (s <= 17))
                .toList());

        System.out.println("4: " + list.stream()
                .map(s -> s * 2)
                .toList());

        System.out.println("5: " + list.stream()
                .sorted()
                .limit(4)
                .toList());

        System.out.println("6: " + list.stream()
                .count());

        System.out.println("7: " + list.stream()
                .mapToInt(s -> Integer.parseInt(String.valueOf(s)))
                .average()
                .getAsDouble());

    }
}
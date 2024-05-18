import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);

        logger.log("Начало работы");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int N = sc.nextInt();
        System.out.print("Введите верхнюю границу значений элементов в списке: ");
        int M = sc.nextInt();

        logger.log("Создаём и наполняем список");

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size()<N) {
            list.add(random.nextInt(M+1));
        }

        logger.log("Выводим полученный список пользователю");

        System.out.println("Полученный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        int f = sc.nextInt();

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Завершаем программу");
    }
}
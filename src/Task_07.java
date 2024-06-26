import java.util.Scanner
public class Task_07 {
    public static void main(String[] args) {
        System.out.println("Задание: 7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

// Заполнение массива случайными числами от 3 до 13
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 11) + 3;
        }

// Подсчет количества вхождений каждой цифры
        int[] count = new int[11];
        for (int i = 0; i < n; i++) {
            count[array[i] - 3]++;
        }

// Вывод результатов
        for (int i = 0; i < count.length; i++) {
            System.out.println("Цифра " + (i + 3) + " встречается " + count[i] + " раз(а)");
        }
    }
}

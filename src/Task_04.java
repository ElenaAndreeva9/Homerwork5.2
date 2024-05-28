public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Задание: 4");
// Инициализация массива
        int[] array = {1, 2, 3, 4, 5};
// Проверка значений массива
        boolean ValuesDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ValuesDuplicates = true;
                    break;
                }
            }
            if (ValuesDuplicates) {
                break;
            }
        }
// Вывод результата
        if (ValuesDuplicates) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

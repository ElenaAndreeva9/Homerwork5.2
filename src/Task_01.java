public class Task_01 {
    System.out.println("Задание: 1");
    int[] fibonacciArray = new int[15];

// Заполняем массив числами Фибоначчи
    fibonacciArray[0] = 0;
    fibonacciArray[1] = 1;
for (int i = 2; i < 15; i++) {
        fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
    }

// Выводим только четные элементы массива на консоль
for (int num : fibonacciArray) {
        if (num % 2 == 0) {
            System.out.print(num + "\t");
        }
    }
}

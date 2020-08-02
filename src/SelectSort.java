public class SelectSort {
    public static void main(String[] args) {
        int array[] = {13, 5, 9, 10, 2, 1, 8, 11}; // Инициализируем массив заполняя его элементами
        int min, temp; // Переменная min которая отвечает за минимальный элемент массива, temp для хранения элементов массива
        System.out.print("Неотсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // Выводим исходный массив на консоль
        for (int i = 0; i < array.length; i++) { // Создаем исходный массив
            min = i;  // Находим минимальный элемент массива
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) { // Если элемент меньше предыдущего
                    min = j;
                }
                temp = array[min]; // Если условие выполняется то меняем элементами местами, то есть с текущим и минимальным
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.print("\nОтсортированный массив методом выбора: ");
        for (int value : array) { // Вывод отсортированного массива на консоль
            System.out.print(value + " ");
        }
    }
}

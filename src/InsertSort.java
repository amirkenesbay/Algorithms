public class InsertSort {
    public static void main(String[] args) {
        int array[] = {13, 5, 9, 10, 2, 1, 8, 11}; // Инициализируем массив заполняя его элементами
        int j, temp;
        System.out.print("Неотсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // Выводим исходный массив на консоль
        for (int i = 0; i < array.length; i++) { // Внешний цикл
            temp = array[i]; // Тут записывается самое первое значение
            for (j = i - 1; j >= 0 && array[j] > temp; j--) { // Создаем цикл который сравнивает с соседним элементом массива
                array[j+1] = array[j]; // Если выполняется условие j >= 0 && array[j] > temp то мы меняем элементы местами
            }
            array[j+1] = temp; // Если условие не выполняется то приравниваем к переменной temp
        }
        System.out.print("\nОтсортированный массив методом вставки: ");
        for (int value : array) { // Вывод отсортированного массива на консоль
            System.out.print(value + " ");
        }
    }
}

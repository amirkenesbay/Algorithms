public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 5, 9, 10, 2, 1, 8, 11}; // инициализируем массив заполняя его элементами

        for (int i = 0; i < arr.length - 1; i++) { //создаем внешний цикл за номер прохода
            for (int j = arr.length - 1; j > i; j--) { //создаем внутренний цикл за перебор элементов в одном проходе
                if (arr[j - 1] > arr[j]) { // если элемент меньше предыдущего
                    int temp = arr[j - 1]; //то меняем их местами
                    arr[j - 1] = arr[j]; // в с++ это можно было сделать при помощи swap
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //вывод массива на консоль
        }
    }
}

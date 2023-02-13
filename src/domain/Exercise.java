package domain;

import java.util.Arrays;

public class Exercise {

    public static void Calculate(int array[], int array_size) {

        /*Заповнимо масив випадковими числами*/
        for (int i = 0; i < array_size; i++) {
            array[i] = (int) Math.round((Math.random() * 30));
        }
        System.out.println("Масив: " + Arrays.toString(array));

        /* Перевірка, щоб в масиві було хоча б два елементи, інакше вивести повідомлення про помилку*/
        if (array_size < 2) {
            System.out.println("Масив повинен мати хоча б два елементи");
        }

        /*Відсортовуємо масив задля зручнішого пошуку потрібного нам значення*/
        Arrays.sort(array);

        /*Починаємо з передостаннього елементу як набільшого елементу*/
        for (int i = array_size - 2; i >= 0; i--) {
            /*Якщо елемент не дорівнює найбільшому елементу*/
            if (array[i] != array[array_size - 1]) {
                System.out.println("Друге за величиною число:" + array[i]);
                return;
            }
        }

    }
}

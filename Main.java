package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.WordsFinder.findEqualVowelsAndConsonats;
import static com.company.WordsFinder.findLatinWords;

public class Main {

    /*

      Знайти ті слова, які містять тільки символи латинського алфавіту. Серед них знайти
    ті слова, які містять рівну кількість голосних та приголосних. На вхід поступає рядок
    із словами. На виході – масив String.

     */


    public static void main(String[] args) {
        System.out.println("Введите предложнение : ");
        System.out.println(Arrays.toString(findEqualVowelsAndConsonats(findLatinWords(getString()))));

    }

    private static String getString() {
        Scanner scanner= new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

}

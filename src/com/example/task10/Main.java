package com.example.task10;


import com.example.task10.additional1.ServiceAdditional1;
import com.example.task10.additional2.ServiceAdditional2;
import com.example.task10.additional3.ServiceAdditional3;
import com.example.task10.additional4.ServiceAdditional4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberDocument = "1234-aBC-5678-DeF-9g0H";
        String pattern = "(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}";

        System.out.println("# Вывод первых двух блоков цифр: ");
        Service.outputNumbers(numberDocument);
        System.out.println();

        System.out.println("# Вывод с заменой букв на звездочки: ");
        Service.outputWithLetterSubstitution(numberDocument);
        System.out.println();

        System.out.println("# Вывод буквенных символов в формате yyy/yyy/y/y в нижнем регистре: ");
        Service.outputLettersInLowercase(numberDocument);
        System.out.println();

        System.out.println("# Вывод буквенных символов в формате yyy/yyy/y/y в верхнем регистре: ");
        Service.outputLettersInUpperCase(numberDocument);
        System.out.println();

        System.out.println(" # Найти abc в строке: ");
        Service.findABCInString(numberDocument);
        System.out.println();

        System.out.println("# Проверить начинается ли номер документа с последовательности 555: ");
        Service.checkStartOfStringForNumber(numberDocument);
        System.out.println();

        System.out.println("# Проверить заканчивается ли номер документа на 1a2b: ");
        Service.checkEndOfLineCharacters(numberDocument);
        System.out.println();

        System.out.println("# Найти мсамое маленькое и самое большое слово :");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ServiceAdditional1.findMaxAndMinWord(line);
        System.out.println();

        System.out.println("# Найти слово, в котором число различных символов минимально :");
        System.out.println("введите номер слова : ");
        String line2 = scanner.nextLine();
        ServiceAdditional2.findMinSymbol(line2);
        System.out.println();

        System.out.println("Введите номер слова,который будет проверен на палиндромность : ");
        String line3 = scanner.nextLine();
        ServiceAdditional3.checkForPalindrome(line3);
        System.out.println();

        System.out.println(" Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки");
        String line4 = scanner.nextLine();
        ServiceAdditional4.enterEachDuplicatedLetter(line4);
    }
}

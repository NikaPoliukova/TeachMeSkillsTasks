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

        System.out.println("# ����� ������ ���� ������ ����: ");
        Service.outputNumbers(numberDocument);
        System.out.println();

        System.out.println("# ����� � ������� ���� �� ���������: ");
        Service.outputWithLetterSubstitution(numberDocument);
        System.out.println();

        System.out.println("# ����� ��������� �������� � ������� yyy/yyy/y/y � ������ ��������: ");
        Service.outputLettersInLowercase(numberDocument);
        System.out.println();

        System.out.println("# ����� ��������� �������� � ������� yyy/yyy/y/y � ������� ��������: ");
        Service.outputLettersInUpperCase(numberDocument);
        System.out.println();

        System.out.println(" # ����� abc � ������: ");
        Service.findABCInString(numberDocument);
        System.out.println();

        System.out.println("# ��������� ���������� �� ����� ��������� � ������������������ 555: ");
        Service.checkStartOfStringForNumber(numberDocument);
        System.out.println();

        System.out.println("# ��������� ������������� �� ����� ��������� �� 1a2b: ");
        Service.checkEndOfLineCharacters(numberDocument);
        System.out.println();

        System.out.println("# ����� ������ ��������� � ����� ������� ����� :");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ServiceAdditional1.findMaxAndMinWord(line);
        System.out.println();

        System.out.println("# ����� �����, � ������� ����� ��������� �������� ���������� :");
        System.out.println("������� ����� ����� : ");
        String line2 = scanner.nextLine();
        ServiceAdditional2.findMinSymbol(line2);
        System.out.println();

        System.out.println("������� ����� �����,������� ����� �������� �� �������������� : ");
        String line3 = scanner.nextLine();
        ServiceAdditional3.checkForPalindrome(line3);
        System.out.println();

        System.out.println(" ������� �� ������� ����� ������, ������� ������������� ������ ����� �� ��������� ������");
        String line4 = scanner.nextLine();
        ServiceAdditional4.enterEachDuplicatedLetter(line4);
    }
}

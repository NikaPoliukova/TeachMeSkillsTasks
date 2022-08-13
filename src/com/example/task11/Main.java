package com.example.task11;


import com.example.task11.Exceptions.Numbers555NotFoundException;
import com.example.task11.Exceptions.SequenceNotFoundException;
import com.example.task11.Exceptions.SymbolsABCNotFoundException;
import com.example.task11.additional.Exceptions.WrongLoginException;
import com.example.task11.additional.Exceptions.WrongPasswordException;
import com.example.task11.additional.InformationAboutPersonService;



public class Main {

    public static void main(String[] args) throws SymbolsABCNotFoundException, Numbers555NotFoundException,
            SequenceNotFoundException, WrongLoginException, WrongPasswordException {
        String pattern = "(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}";
        String numberDocument = "5554-aBC-5678-DeF-1a2b";

        try {
            System.out.println(" # ����� abc � ������: ");
            Service.findABCInString(numberDocument);
            System.out.println("# ��������� ���������� �� ����� ��������� � ������������������ 555: ");
            Service.checkStartOfStringForNumber(numberDocument);
            System.out.println("# ��������� ������������� �� ����� ��������� �� 1a2b: ");
            Service.checkEndOfLineCharacters(numberDocument);
        } catch (SymbolsABCNotFoundException | Numbers555NotFoundException | SequenceNotFoundException e) {
            e.printStackTrace();
        }

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

        System.out.println("�������������� �������");
        try {
            InformationAboutPersonService.validateInputParams("Nika", "nika123",
                    "nika123");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}


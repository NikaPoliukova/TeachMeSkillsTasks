package task8.additional;

import java.util.Scanner;

public class ClinicMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Daniel", "31.01.1988", "�������");

        System.out.println(" ������� ��� ����� �������");
        Scanner treatmentCode = new Scanner(System.in);

        TreatmentPlane treatmentPlane = new TreatmentPlane(patient, treatmentCode.nextInt());

        int code = treatmentPlane.getCode();

        if (code == 1) {
            System.out.println("��������� �������");
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (code == 2) {
            System.out.println("��������� ��������");
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            System.out.println("��������� ���������");
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}

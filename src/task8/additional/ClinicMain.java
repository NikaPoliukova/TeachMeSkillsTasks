package task8.additional;

import java.util.Scanner;

public class ClinicMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Daniel", "31.01.1988", "мужской");

        System.out.println(" введите код плана лечения");
        Scanner treatmentCode = new Scanner(System.in);

        TreatmentPlane treatmentPlane = new TreatmentPlane(patient, treatmentCode.nextInt());

        int code = treatmentPlane.getCode();

        if (code == 1) {
            System.out.println("Назначаем хирурга");
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (code == 2) {
            System.out.println("Назначаем дантиста");
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            System.out.println("Назначаем терапевта");
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}

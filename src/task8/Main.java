package task8;

import task8.exersice1.Phone;


public class Main {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("12548721", "В128", 125),
                new Phone("1548451", "A312", 152),
                new Phone("87542541", "F1000")};
        int n = 1;
        for (Phone phone : phones) {
            System.out.println(phone);
            System.out.println();
            phone.receiveCall("Nika" + n);
            ++n;
            System.out.println("номер телефона : " + phone.getNumber());
            System.out.println();
        }
        phones[1].receiveCall("Kati", "1254752");
        phones[1].sendMessage("1544512121", "256484510", "251545612");
    }
}
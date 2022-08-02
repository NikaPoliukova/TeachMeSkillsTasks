package task8.exersice1;

public class Phone {
    private String number;
    private String model;
    private int weight;


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String nameCaller) {
        if (nameCaller != null) {
            System.out.println("Звонит :" + nameCaller);
        } else {
            System.out.println("Не введено имя абонента");
        }
    }

    public void receiveCall(String nameCaller, String number) {
        if (nameCaller != null & number.length() == 7) {
            System.out.println("Звонит :" + nameCaller);
            System.out.println("Номер телефона абонента : " + number);
        } else {
            System.out.println("Не введено имя абонента или не корректно введен номер");
        }
    }

    @Override
    public String toString() {
        return "Phone:" + "\n" +
                "number = " + number + "\n" +
                "model  = " + model + "\n" +
                "weight = " + weight + " gr.";
    }

    public void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + 1 + ": " + numbers[i]);
        }
    }
}


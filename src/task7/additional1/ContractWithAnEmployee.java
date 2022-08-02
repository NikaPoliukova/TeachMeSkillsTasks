package task7.additional1;

import java.util.Date;

public class ContractWithAnEmployee extends Document {
    private String dateFinishContract;
    private String nameEmployee;

    public ContractWithAnEmployee() {
    }

    public ContractWithAnEmployee(int documentNumber, Date dateDocument, String dateFinishContract,
                                  String nameEmployee) {
        super(documentNumber, dateDocument);
        this.dateFinishContract = dateFinishContract;
        this.nameEmployee = nameEmployee;
    }

    public String getDateFinishContract() {
        return dateFinishContract;
    }

    public void setDateFinishContract(String dateFinishContract) {
        this.dateFinishContract = dateFinishContract;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "ContractWithAnEmployee :" + "\n" +
                "[DateFinishContract = " + dateFinishContract + "\n" +
                "NameEmployee = '" + nameEmployee + '\'' + "\n" +
                super.toString() + ']';
    }
}

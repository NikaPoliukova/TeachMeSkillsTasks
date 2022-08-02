package task7.additional1;

import java.util.Date;

public class ContractForTheSupplyOfGoods extends Document {
    private String productType;
    private int amountProduct;

    public ContractForTheSupplyOfGoods() {
    }

    public ContractForTheSupplyOfGoods(int documentNumber, Date dateDocument, String productType, int amountProduct) {
        super(documentNumber, dateDocument);
        this.productType = productType;
        this.amountProduct = amountProduct;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    @Override
    public String toString() {
        return "ContractForTheSupplyOfGoods: " + "\n" +
                "[ProductType = '" + productType + '\'' + "\n" +
                "AmountProduct = " + amountProduct + "\n" +
                super.toString() + ']';
    }
}


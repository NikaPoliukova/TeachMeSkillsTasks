package com.example.task7.additional1;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double totalAmountForMonth;
    private int departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int documentNumber, Date dateDocument, double totalAmountForMonth, int departmentCode) {
        super(documentNumber, dateDocument);
        this.totalAmountForMonth = totalAmountForMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice: " + "\n" +
                "[TotalAmountForMonth = " + totalAmountForMonth + "\n" +
                "DepartmentCode = " + departmentCode + "\n" +
                super.toString() + ']';
    }
}

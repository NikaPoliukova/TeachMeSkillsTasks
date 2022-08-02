package task7;

import task7.additional1.*;
import task7.exercise1.Circle;
import task7.exercise1.Figure;
import task7.exercise1.Rectangle;
import task7.exercise1.Triangle;
import task7.exercise2.Accountant;
import task7.exercise2.Director;
import task7.exercise2.Worker;
import java.text.DecimalFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Task ¹1: Find the sum of the areas and perimeters of all shapes in an array: ");
        Figure[] figures = {new Rectangle(3, 4),
                new Triangle(5, 3, 6),
                new Circle(5), new Circle(4), new Rectangle(7, 9)};
        double sumPerimeter = 0;
        DecimalFormat df = new DecimalFormat("###.##");
        for (Figure figure : figures) {
            System.out.println("Figure area " + figure.getName() + " = " + df.format(figure.getArea()));
            System.out.println("Figure perimeter " + figure.getName() + " = " + df.format(figure.getPerimeter()));
            sumPerimeter += figure.getPerimeter();
            System.out.println();
        }
        System.out.println("Sum of perimeters of all figures into an array = " + df.format(sumPerimeter));
        System.out.println();

        System.out.println("Task ¹2 : Print job titles of employees: ");
        Director director = new Director();
        director.print();
        Accountant accountant = new Accountant();
        accountant.print();
        Worker worker = new Worker();
        worker.print();
        System.out.println();

        System.out.println("Task ¹3 : Create a document accounting system(maximum number of documents = 10): ");
        Register register = new Register();
        Document[] documents = new Document[]{new ContractWithAnEmployee(1251, new Date(),
                "15.02.2023", "Nika"), new FinancialInvoice(125,
                new Date(), 12, 8785),
                new ContractForTheSupplyOfGoods(155, new Date(), "Plate", 458),
                new ContractForTheSupplyOfGoods(), new FinancialInvoice(), new ContractWithAnEmployee()};

        for (Document document : documents) {
            register.saveDocument(document);
            register.provisionOfInformation(document);
        }
    }
}




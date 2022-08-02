package task7.additional1;

public class Register {
    Document[] documents = new Document[10];
    int positionNumber = 0;

    public void saveDocument(Document document)throws RuntimeException {
        if (positionNumber < 10) {
            documents[positionNumber] = document;
            positionNumber++;
        } else {
            throw new RuntimeException("The maximum number of generated documents has been exceeded, " +
                    "maximum number = 10");
        }
    }

    public void provisionOfInformation(Document document) {
        System.out.println(document);
        System.out.println();
    }
}





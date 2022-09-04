package com.example.task17;

import com.example.task17.jaxbTask.MainJAXB;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.example.task17.DocumentService.buildDocument;
import static com.example.task17.utils.FileUtils.findFile;
import static com.example.task17.utils.FileUtils.writeLinesToFile;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, JAXBException {
        DocumentService service = new DocumentService();
        String folderName = "D:\\project\\TeachMeSkillsTasks\\TeachMeSkillsTasks\\src\\com\\example\\task17\\xmlFileFolder";
        final String FILE_EXTENSION = ".xml";
        String fileName = findFile(folderName, FILE_EXTENSION);
        Document document = buildDocument(folderName + "\\" + fileName);

        List<String> lines = service.findLines(document);
        Map<String, String> authorInformation = service.findAuthorInformation(document);
        String title = service.findTitle(document);

        String outputFileName = authorInformation.get("firstName") + "_" + authorInformation.get("lastName")
                + "_" + title + ".txt";
        String outputFilePath = folderName + "\\" + outputFileName;

        writeLinesToFile(outputFilePath, lines);
        System.out.println("---------------Additional task 3------------------");
        MainJAXB mainJAXB = new MainJAXB();
        mainJAXB.unmarshall();
    }
}



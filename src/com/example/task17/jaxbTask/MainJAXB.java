package com.example.task17.jaxbTask;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.*;


public class MainJAXB {
    public Sonnet unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Sonnet.class);
        return (Sonnet) context.createUnmarshaller()
                .unmarshal(new FileReader("D:\\project\\TeachMeSkillsTasks\\" +
                        "TeachMeSkillsTasks\\src\\com\\example\\task17\\xmlFileFolder\\myFile.xml"));
    }
}

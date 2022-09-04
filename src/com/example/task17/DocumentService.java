package com.example.task17;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentService {
    public static Document buildDocument(String path) throws ParserConfigurationException, IOException, SAXException {
        File file = new File(path);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(file);
    }

    public List<String> findLines(Document document) {
        List<String> lines = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("lines");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() != Node.TEXT_NODE) {
                NodeList authorProps = node.getChildNodes();
                for (int j = 0; j < authorProps.getLength(); j++) {
                    Node authorProp = authorProps.item(j);
                    if (authorProp.getNodeType() != Node.TEXT_NODE) {
                        lines.add(authorProp.getChildNodes().item(0).getTextContent());
                    }
                }
            }
        }
        return lines;
    }

    public Map<String, String> findAuthorInformation(Document document) {
        Map<String, String> authorName = new HashMap<>();
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("author");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() != Node.TEXT_NODE) {
                NodeList authorProps = node.getChildNodes();
                for (int j = 0; j < authorProps.getLength(); j++) {
                    Node authorProp = authorProps.item(j);
                    if (authorProp.getNodeType() != Node.TEXT_NODE) {
                        if (authorProp.getNodeName().equals("firstName")) {
                            authorName.put("firstName", authorProp.getChildNodes().item(0).getTextContent());
                        } else if (authorProp.getNodeName().equals("lastName")) {
                            authorName.put("lastName", authorProp.getChildNodes().item(0).getTextContent());
                        }
                    }
                }
            }
        }
        return authorName;
    }

    public String findTitle(Document document) {
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("title");
        Node node = nodeList.item(0);
        return node.getChildNodes().item(0).getTextContent();
    }
}

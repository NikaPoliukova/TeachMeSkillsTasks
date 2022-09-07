package com.example.task17.jaxbTask;

import com.example.task17.jaxbTask.Author;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "sonnet")
@XmlType(propOrder = {"author", "title", "lines"})
public class Sonnet {
    @XmlElement
    private Author author;
    @XmlElement
    private String title;
    @XmlElementWrapper(name = "lines")
    @XmlElement(name = "line")
    private List<String> lines;


    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" + "\n" +
                "author=" + author + "\n" +
                ", title='" + title + '\'' + "\n" +
                ", lines=" + lines +
                '}';
    }
}

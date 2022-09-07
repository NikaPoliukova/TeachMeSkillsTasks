package com.example.task17.utils;

import com.example.task17.exception.EmptyFolderException;
import com.example.task17.exception.FolderNotFoundException;
import com.example.task17.exception.IllegalAmountFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static String findFile(String directoryPath, String fileExtension) {
        File file = new File(directoryPath);
        String[] files;
        if (file.exists()) {
            if (file.isDirectory()) {
                files = file.list();
            } else {
                throw new EmptyFolderException("Folder is empty");
            }
        } else {
            throw new FolderNotFoundException("Folder not found");
        }
        List<String> fileNames = new ArrayList<>();
        for (String fileName : files) {
            if (fileName.endsWith(fileExtension)) {
                fileNames.add(fileName);
            }
        }
        if (fileNames.size() > 1) {
            throw new IllegalAmountFiles("There are more then one files in folder");
        }
        return fileNames.get(0);
    }

    public static void writeLinesToFile(String filePath, List<String> lines) {
        try(FileWriter writer = new FileWriter(filePath, false)) {
            for (String line : lines) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

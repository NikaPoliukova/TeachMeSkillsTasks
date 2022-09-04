package com.example.task16.servises;

import com.example.task17.exception.EmptyFolderException;
import com.example.task17.exception.FolderNotFoundException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> findFiles(String directoryPath, String fileExtension) {
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
        return fileNames;
    }
}

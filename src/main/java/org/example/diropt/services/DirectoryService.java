package org.example.diropt.services;

import java.io.File;

import org.example.diropt.entities.Directories;


public class DirectoryService {

    private static Directories fileDirectory = new Directories();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : DirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Directories getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directories fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }


}

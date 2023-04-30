package HomeWorks;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Day_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String ext = sc.nextLine();

        PrintAllNamesOfFilesAndCatalogs(path);
        CheckFileExists(path);
        SearchFilesOfExpansion(path, ext);
        CheckFileOnReadingAndWriting(path);
        IsPathDirectoryOrFile(path);

    }
    public static void PrintAllNamesOfFilesAndCatalogs(String path) {
        File file = new File(path);

        if (!file.isDirectory()) { System.out.println("Path must be a directory"); return; }

        String[] files = file.list();

        for (String f : files) {
            System.out.println(f);
        }

        /*
        String path = "D:\\Programming\\java\\my_best_proj";

        My output:

        .git
        .gitignore
        .idea
        copied_file.txt
        data.bin
        file.txt
        ile.txt
        ItStep.txt
        ItstepNew.txt
        my_best_proj.iml
        out
        person.dat
        src
         */
    }

    public static class FilterExpansion implements FilenameFilter {

        private String ext;

        public FilterExpansion(String ext){
            this.ext = ext.toLowerCase();
        }
        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(ext);
        }
    }
    public static void SearchFilesOfExpansion(String path, String expansion) {
        File file = new File(path);

        File[] listFiles = file.listFiles(new FilterExpansion(expansion));
        if(listFiles.length == 0){
            System.out.println(file + " не содержит файлов с расширением " + expansion);
        }else{
            for(File f : listFiles)
                System.out.println("Файл: " + file + File.separator + f.getName());
        }
    }

    public static void CheckFileExists(String path) {
        File file = new File(path);

        if(file.exists()){
            System.out.println("File exists");
        }
        else {
            System.out.println("File not found");
        }
    }

    public static void CheckFileOnReadingAndWriting(String path) {
        File file = new File(path);

        if(file.canRead()){
            System.out.println("File can be read");
        }
        else {
            System.out.println("File can`t be read");
        }
        if(file.canWrite()){
            System.out.println("File can be written");
        }
        else {
            System.out.println("File can`t be written");
        }
    }
    public static void IsPathDirectoryOrFile(String path) {
        File file = new File(path);

        if(file.isDirectory()){
            System.out.println("Path is directory");
        }
        else {
            System.out.println("Path is file");
        }
    }

}

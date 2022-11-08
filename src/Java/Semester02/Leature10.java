package Semester02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Leature10 {
    public static void main(String args[]) {
        try {
            // Creating an object of a file
            File f0 = new File("C:\\Users\\Chong\\Desktop\\FileOperationExample.json");
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
        File f0 = new File("C:\\Users\\Chong\\Desktop\\FileOperationExample.json");
        if (f0.exists()) {
            // Getting file name
            System.out.println("The name of the file is: " + f0.getName());
            // Getting path of the file
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());
            // Checking whether the file is writable or not
            System.out.println("Is file writeable?: " + f0.canWrite());

            // Checking whether the file is readable or not
            System.out.println("Is file readable " + f0.canRead());

            // Getting the length of the file in bytes
            System.out.println("The size of the file in bytes is: " + f0.length());
        } else {
            System.out.println("The file does not exist.");
        }
        try {
            FileWriter fwrite = new FileWriter("C:\\Users\\Chong\\Desktop\\FileOperationExample.json");
            // writing the content into the FileOperationExample.txt file
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                fwrite.write(rand.nextInt(100) + "\t"+"\n");
            }

                // Closing the stream
                fwrite.close();
                System.out.println("Content is successfully wrote to the file.");
            } catch(IOException e){
                System.out.println("Unexpected error occurred");
                e.printStackTrace();
            }
        }
    }


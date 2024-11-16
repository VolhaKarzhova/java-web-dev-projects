package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(25,5);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Ann", "CoolProgram.pdf");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String,String> entry : studentFiles.entrySet()){
            System.out.println(entry.getKey() + " gets " + CheckFileExtension(entry.getValue()) + " points.");
        }
    }

    public static void Divide(int x, int y)
    {
        if(y == 0){
            try{
                throw new ArithmeticException("You cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println(x/y);
        // Write code here!
    }

    public static int CheckFileExtension(String fileName)
    {
        int points = 0;
        if(fileName== null || fileName.isBlank()){
            try{
                points = -1;
                throw new FileExtensionException("File is not submitted");
            } catch (FileExtensionException e) {
                e.printStackTrace();
            }
        }
        if(fileName.endsWith(".java")){
            return 1;
        }
        return points;
        // Write code here!
    }
}
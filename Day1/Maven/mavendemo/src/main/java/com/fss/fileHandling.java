package com.fss;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class fileHandling 
{
    public static void main( String[] args )
    {
        File f= new File("src\\main\\java\\com\\fss\\name.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            //f.deleteOnExit();
            writer.write("dhivakar writer done");
            System.out.println("File written successfully!");


            // Scanner sc = new Scanner(f);
            // while (sc.hasNextLine()) {
            //     System.out.println(sc.nextLine());
                
            // }
            //sc.close();
        } catch (Exception e) {
           System.out.println("file not found");
        }
    }
}
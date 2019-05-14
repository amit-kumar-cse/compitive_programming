package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            scanner = new Scanner(new File("lines.txt"));
            while (scanner.hasNext()){
                String str = scanner.nextLine();
                String[] strArray = str.split(" ");
                for(String token: strArray){
                    System.out.println(token);
                }
                System.out.println("\n");
            }
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }
}

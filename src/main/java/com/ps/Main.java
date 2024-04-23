package com.ps;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader bufReader = new BufferedReader(new FileReader("employee.txt"));

            String line;
            while((line = bufReader.readLine())!= null){
                String[] splitLine = line.split("\\|");

                long id = Integer.parseInt(splitLine[0]);
                String name = splitLine[1];
                float hoursWorked = Float.parseFloat(splitLine[2]);
                float payRate = Float.parseFloat(splitLine[3]);

                System.out.printf("id: %d, name: %s, hoursWorked: %f, payRate: %f \n", id, name, hoursWorked, payRate);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
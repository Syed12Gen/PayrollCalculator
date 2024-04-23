package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Use try-with-resources for automatic resource management
        try (BufferedReader bufReader = new BufferedReader(new FileReader("employee.txt"));
             BufferedWriter bufWriter = new BufferedWriter(new FileWriter("write.txt"))) {

            String line;
            while ((line = bufReader.readLine()) != null) {
                String[] splitLine = line.split("\\|");
                long id = Long.parseLong(splitLine[0]);
                String name = splitLine[1];
                float hoursWorked = Float.parseFloat(splitLine[2]);
                float payRate = Float.parseFloat(splitLine[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                // Formatted string for console output and writing to file
                String employeeInfo = String.format(

                        "Employee ID: %d, Name: %s, Hours Worked: %.2f, Pay Rate: %.2f, Gross Pay: %.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getHoursWorked(),
                        employee.getPayRate(),
                        employee.calcGrossPay());

                // Print to console
                System.out.print(employeeInfo);

                // Write to file
                bufWriter.write(employeeInfo);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

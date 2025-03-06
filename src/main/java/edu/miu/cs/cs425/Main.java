package edu.miu.cs.cs425;
import edu.miu.cs.cs425.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // create a list of patients aand print to console
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient("John", "Doe", "1234567890", "john@example.com", "Los Angeles", "2000-01-05"));
        patients.add(new Patient("Jane", "Smith", "0987654321", "jane@example.com", "New York", "1999-12-10"));
        patients.add(new Patient("Bob", "Johnson", "9876543210", "bob@example.com", "Chicago", "1995-05-15"));

        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
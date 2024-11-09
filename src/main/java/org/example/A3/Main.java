package org.example.A3;

import org.example.A3.PatientManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PatientManager manager = new PatientManager();

        manager.addPatient(new Patient(1, "Иванов", "Иван", "Иванович", "ул. Ленина, 1", "123456789", 101, "Грипп"));
        manager.addPatient(new Patient(2, "Петров", "Петр", "Петрович", "ул. Пушкина, 2", "987654321", 102, "ОРВИ"));
        manager.addPatient(new Patient(3, "Сидоров", "Сидор", "Сидорович", "ул. Гагарина, 3", "456123789", 103, "Грипп"));
        manager.addPatient(new Patient(4, "Кузнецов", "Андрей", "Сергеевич", "ул. Мира, 4", "321654987", 104, "Аллергия"));

        System.out.println("Пациенты с диагнозом 'ОРВИ':");
        List<Patient> fluPatients = manager.findPatientsByDiagnosis("ОРВИ");
        for (Patient patient : fluPatients) {
            System.out.println(patient);
        }

        System.out.println("\nПациенты с номерами мед. карт в интервале [102, 104]:");
        List<Patient> cardRangePatients = manager.findPatientsByMedicalCardRange(102, 104);
        for (Patient patient : cardRangePatients) {
            System.out.println(patient);
        }
    }
}

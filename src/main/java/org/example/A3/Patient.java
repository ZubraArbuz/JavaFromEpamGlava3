package org.example.A3;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private int medicalCardNumber;
    private String diagnosis;

    public Patient(int id, String lastName, String firstName, String middleName, String address,
                   String phone, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String lastName, String firstName, String middleName) {
        this(id, lastName, firstName, middleName, "", "", 0, "");
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}

class PatientManager {
    private List<Patient> patients;

    public PatientManager() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> findPatientsByDiagnosis(String diagnosis) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                result.add(patient);
            }
        }
        return result;
    }

    public List<Patient> findPatientsByMedicalCardRange(int min, int max) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getMedicalCardNumber() >= min && patient.getMedicalCardNumber() <= max) {
                result.add(patient);
            }
        }
        return result;
    }
}


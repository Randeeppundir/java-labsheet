import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private final int id;
    private final String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name);
    }
}

public class Q09_PatientQueue {
    private final Queue<Patient> patients = new LinkedList<>();

    public void addPatient(Patient patient) {
        patients.offer(patient);
        System.out.println("Patient added to waiting queue.");
    }

    public void servePatient() {
        Patient patient = patients.poll();
        if (patient == null) {
            System.out.println("No patients waiting.");
        } else {
            System.out.println("Now serving:");
            patient.display();
        }
    }

    public static void main(String[] args) {
        Q09_PatientQueue clinic = new Q09_PatientQueue();
        clinic.addPatient(new Patient(1, "Aman"));
        clinic.addPatient(new Patient(2, "Riya"));
        clinic.addPatient(new Patient(3, "Karan"));

        clinic.servePatient();
        clinic.servePatient();
        clinic.servePatient();
        clinic.servePatient();
    }
}

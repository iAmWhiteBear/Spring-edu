package hospital.service;

import hospital.Entities.Doctor;
import hospital.Entities.DoctorImpl;
import hospital.Entities.Patient;
import hospital.Entities.PatientImpl;

import java.util.*;

public class Filler {
    private static List<Patient> patients = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();

    static{
        patients.add(new PatientImpl("Grunya"));
        patients.add(new PatientImpl("Vanya")) ;
        patients.add(new PatientImpl("Tanya")) ;
        patients.add(new PatientImpl("Sanya")) ;
        patients.add(new PatientImpl("Senya")) ;
        patients.add(new PatientImpl("Zhenya")) ;
        patients.add(new PatientImpl("Venya")) ;
        patients.add(new PatientImpl("Danya")) ;
        patients.add(new PatientImpl("Igor")) ;

        doctors.add(new DoctorImpl("Filatov"));
        doctors.add(new DoctorImpl("Kurpatov"));
        doctors.add(new DoctorImpl("Andropov"));
    }

    public static List<Doctor> getDoctors(){
        return doctors;
    }

    public static Patient getPatient() {
        return patients.get((int)(Math.random()*patients.size()));
    }
}

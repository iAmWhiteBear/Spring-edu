package hospital;

import hospital.Entities.Card;
import hospital.Entities.Doctor;
import hospital.Entities.Patient;
import hospital.Repository.Archive;
import hospital.Repository.Doctors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Registration {

    private Archive archive;
    private Doctors doctorList;

    @Autowired
    public Registration(Archive archive, Doctors doctorList) {
        this.archive = archive;
        this.doctorList = doctorList;
    }

    public void servePatient(Patient patient){
        Card card = archive.getCard(patient);
        Doctor doctor = doctorList.getDoctor();
        doctor.putPatient(patient);
        String ticket = "Patient " +
                patient.toString() +
                " got ticket to Doctor " +
                doctor.toString() +
                ", number in queue: " +
                doctor.getLineNum();


        System.out.println(ticket);
    }
}

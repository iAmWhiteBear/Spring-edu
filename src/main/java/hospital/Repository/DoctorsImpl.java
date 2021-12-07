package hospital.Repository;

import hospital.Entities.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@Repository
public class DoctorsImpl implements Doctors {
    List<Doctor> doctors;

    public DoctorsImpl(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public Doctor getDoctor() {
        return doctors.get((int) (Math.random()*doctors.size()));
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor){
        doctors.remove(doctor);
    }
}

package hospital.Entities;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class DoctorImpl implements Doctor {
    String name;
    Queue<Patient> queue;

    public DoctorImpl(String name) {
        this.name = name;
        queue = new PriorityQueue<>();
    }

    public String getName() {
        return name;
    }

    public void putPatient(Patient patient){
        queue.add(patient);
    }

    public Patient servePatient(){
        return queue.poll();
    }

    @Override
    public int getLineNum() {
        return queue.size();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorImpl doctor = (DoctorImpl) o;
        return Objects.equals(name, doctor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Doctor "+name;
    }
}

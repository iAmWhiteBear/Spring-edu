package hospital.Entities;

import java.util.Objects;

public class PatientImpl implements Patient, Comparable<Patient> {
    String name;

    public PatientImpl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientImpl patient = (PatientImpl) o;
        return Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Patient o) {
        return 1;
    }
}

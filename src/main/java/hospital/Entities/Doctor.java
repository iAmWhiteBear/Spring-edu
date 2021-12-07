package hospital.Entities;

public interface Doctor {
    void putPatient(Patient patitent);
    Patient servePatient();
    int getLineNum();

}

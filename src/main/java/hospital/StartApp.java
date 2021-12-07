package hospital;


import hospital.Repository.Doctors;
import hospital.Repository.DoctorsImpl;
import hospital.service.Filler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class StartApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StartApp.class);
        Registration registration = context.getBean("registration",Registration.class);
        Doctors doctors = context.getBean("doctorsImpl", DoctorsImpl.class);
        //заполняю больницу докторами
        Filler.getDoctors().forEach((doctors::addDoctor));


        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
        registration.servePatient(Filler.getPatient());
    }
}

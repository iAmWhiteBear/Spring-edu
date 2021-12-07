package hospital.Repository;

import hospital.Entities.Card;
import hospital.Entities.Patient;

public interface Archive {

    Card getCard(Patient patient);

}

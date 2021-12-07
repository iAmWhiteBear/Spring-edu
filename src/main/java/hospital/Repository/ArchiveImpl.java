package hospital.Repository;

import hospital.Entities.Card;
import hospital.Entities.CardImpl;
import hospital.Entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ArchiveImpl implements Archive {

    Map<Patient,Card> cardArchive;


    public ArchiveImpl() {
        cardArchive = new HashMap<>();
    }

    @Override
    public Card getCard(Patient patient) {
        if (!cardArchive.containsKey(patient)) cardArchive.put(patient,new CardImpl(patient));
        return cardArchive.get(patient);
    }
}

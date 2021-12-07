package hospital.Entities;

public class CardImpl implements Card {
    private Patient pacient;

    public CardImpl(Patient pacient) {
        this.pacient = pacient;
    }

    @Override
    public String toString() {
        return pacient + " got card";
    }
}

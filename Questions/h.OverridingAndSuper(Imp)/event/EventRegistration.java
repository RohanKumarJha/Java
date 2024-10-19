package event;
public class EventRegistration {
    private String name;
    private String nameOfEvent;
    private double registrationFee;

    EventRegistration(String name,String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }
    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }
    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent() {
        if(this.nameOfEvent=="ShakeALeg") {
            registrationFee = 100;
        } else if(this.nameOfEvent=="Sing&Win") {
            registrationFee = 150;
        } else if(this.nameOfEvent=="Actathon") {
            registrationFee = 70;
        } else if(this.nameOfEvent=="PlayAway") {
            registrationFee = 130;
        }
    }
}
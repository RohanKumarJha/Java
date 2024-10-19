package event;
public class TeamEventRegistration extends EventRegistration {
    private int numberOfParticipant;
    private int teamNo;

    public TeamEventRegistration(String name,String nameOfEvent,int numberOfParticipant,int teamNo) {
        super(name, nameOfEvent);
        this.numberOfParticipant = numberOfParticipant;
        this.teamNo = teamNo;
    }

    public int getNumberOfParticipant() {
        return numberOfParticipant;
    }
    public void setNumberOfParticipant(int numberOfParticipant) {
        this.numberOfParticipant = numberOfParticipant;
    }

    public int setTeamNo() {
        return teamNo;
    }
    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent() {
        boolean flag = true;
        if(getNameOfEvent()=="ShakeALeg") {
            setRegistrationFee(50);
        } else if(getNameOfEvent()=="Sing&Win") {
            setRegistrationFee(60);
        } else if(getNameOfEvent()=="Actathon") {
            setRegistrationFee(80);
        } else if(getNameOfEvent()=="PlayAway") {
            setRegistrationFee(100);
        } else {
            flag = false;
            System.out.println("Please choose a valid event");
        }

        if(flag) {
            System.out.println("Thank You "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getRegistrationFee()*this.getNumberOfParticipant());
        }
    }
}
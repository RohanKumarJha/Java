package event;
public class SingleEventRegistration extends EventRegistration {
    private int participantNo;

    public SingleEventRegistration(String name,String nameOfEvent,int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }
    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public void registerEvent() {
        boolean flag = true;
        if(getNameOfEvent()=="ShakeALeg") {
            setRegistrationFee(100);
        } else if(getNameOfEvent()=="Sing&Win") {
            setRegistrationFee(150);
        } else if(getNameOfEvent()=="PlayAway") {
            setRegistrationFee(130);
        } else {
            flag = false;
            System.out.println("Please choose a valid event");
        }

        if(flag) {
            System.out.println("Thank You "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+this.participantNo);
        }
    }
}

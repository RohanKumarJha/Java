import event.*;
public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        EventRegistration participant1 = new SingleEventRegistration("Jenny","Sing&Win",1);
        participant1.registerEvent();

        EventRegistration participant2 = new TeamEventRegistration("Aura","ShakeALeg",5,1);
        participant2.registerEvent();

        EventRegistration participant3 = new TeamEventRegistration("Aura","Fly&enjoy",5,1);
        participant3.registerEvent();
    }
}

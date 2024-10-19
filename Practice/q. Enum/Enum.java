enum Status {
    Running, Failed, Success, Pending;
}

public class Enum {
    public static void main(String[] args) {
        Status obj = Status.Success;
        if(obj == Status.Running) {
            System.out.println("Keep Going...");
        } else if(obj == Status.Failed) {
            System.out.println("Oops... Try Again");
        } else if(obj == Status.Success) {
            System.out.println("Well done");
        } else {
            System.out.println("Wait...");
        }

        // For Loop
        Status[] stat = Status.values();
        for(Status ss : stat) {
            System.out.println(ss);
        }
    }
}
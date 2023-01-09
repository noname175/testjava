package Personality;
import Action.Sit;
import Enum.Difficult;
import Enum.Time;
import Enum.Location;


public class Boy extends Person {
    public Boy(String name){
        super(name);
    }


    public void BoyWasAfraid(Difficult inrealy) {
        System.out.print(this.name + " был" + inrealy.getTranslation());
        isAfraid();
    }
    public void BoyCounted(Difficult what){
        System.out.print(this.name + " считал" + what.getTranslation());
        isLurking();
    }
    private boolean afraid = false;

    public void isAfraid() {                    // вывод страха
        if (afraid) System.out.println("очень напуган.");
        else System.out.println("не очень напуган.");
    }

    public void setScare(boolean scare) {// проверка на страх
        this.afraid = scare;
    }

    private boolean lurking = false;

    public void isLurking() {                       // вывод страха
        if (lurking) System.out.print("притаиться. ");
        else System.out.print("не притаиться");
    }

    public void setlurking(boolean lurking) {// проверка на страх
        this.lurking = lurking;
    }

    public void HeHope(Difficult what, Sit s, PropellerMan c, Time night, Location roof){
        System.out.print("Он надеялся" + what.getTranslation() + s.sitYes(c) + night.getTime() + roof.getLocation());
    }

    public class Arm{
        public void giveAHand(){
            System.out.print("пожать руку");
        }
        public void pushAway(Person p,Person m, Arm a){
            System.out.print("Но " + p + " отпихнул " + a +" "+ m+"a" );
        }
        @Override
        public String toString() {
            return "руку";
        }
    }


    @Override
    public String toString() {
        return name;
    }
}

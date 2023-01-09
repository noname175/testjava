package Personality;

import Interface.Say;
import Enum.Location;

public class PropellerMan extends Person implements Say {


    private boolean scare = false;

    public PropellerMan(String name) {
        super(name);
    }

    public void he(boolean reg) {
        if (reg) System.out.print("Он ");
        else System.out.print("он ");
    }

    public void isScare() {                    // вывод страха
        if (scare) System.out.print("боялся ");
        else System.out.print("не боялся. ");
    }

    public void setScare(boolean scare) {// проверка на страх
        this.scare = scare;
    }

    private String locationMan = ""; // локация карлсона

    public void getLocation() { // вывод локации карлсона
        System.out.print(locationMan);
    }

    public void setLocation(Location location) { // определение локации карлсона
        if (location.getLocation().equals(locationMan)) {
            System.out.println(" ОН и ТАК ТУТ");
        } else {
            switch (location) {
                case PLACE -> locationMan = Location.PLACE.getLocation();
                case WINDOW -> locationMan = Location.WINDOW.getLocation();
                case HOUSE_ROOF -> locationMan = Location.HOUSE_ROOF.getLocation();
            }

        }

    }

    public void stayHere() {
        System.out.print("стоял");
        getLocation();
    }

    private boolean digUp = false;

    public boolean isDigUp() {
        System.out.print("выкапывал персиковую косточку");
        return digUp;
    }

    public void setDigUp(boolean digUp) {
        this.digUp = digUp;
    }


    @Override
    public String toString() {
        return name;
    }

    public void say() {
        System.out.print(" сказал");
    }

    @Override
    public void brake() {
            System.out.print("kmfkm");
        }
    }


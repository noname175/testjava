
package Personality;


import Interface.Info;

public class PeachPit implements Info {
    public String name;
    public PeachPit(String name){
        this.name = name;
    }

    private boolean sprouted = false;// проросла ли косточка
    private boolean dug = false; // провекра на то где находится косточка(true = вырыта  false = зарыта)


    public void setDug(boolean function) {
        this.dug = function;
    }

    public boolean isDug(boolean dug) {
        if (dug) System.out.print("вырыта");
        else System.out.print("зарыта");
        return dug;
    }

    public boolean isSprouted() {
        return sprouted;
    }
    public void howSprouted() {
        System.out.print("насколько " + toString() + " проросла ");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void info(){
        if (sprouted) System.out.print("косточка проросла");
        else System.out.print("косточке плохо");
    }

}

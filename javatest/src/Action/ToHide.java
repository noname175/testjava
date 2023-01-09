package Action;

public class ToHide extends Actions {
    public void toHide(){
        System.out.print("притаится как мышь.");
    }

    public void notToHide(){
        System.out.print("не притаится как мышь.    ");
    }



    @Override
    public String toString() {
        return "притаиться";

    }
}

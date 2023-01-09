package Action;

import Personality.PropellerMan;

public class Sit extends Actions{
    public String sitYes(PropellerMan carl){
        return (carl + " просидит");
    }

    public String sitNo(PropellerMan carl){
        return (carl + " не просидит");
    }

    @Override
    public String toString() {
        return "сидеть";

    }
}

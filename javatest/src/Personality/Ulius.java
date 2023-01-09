package Personality;

public class Ulius extends Person {

    public Ulius(String name) {
        super(name);
    }

    public void hopeConvice(Person c) {
        System.out.println("и он рассчитывал, что с его помощью ему удастся переубедить " + c.toString() + "a.");
    }

    public static class BagCaramels {
        private final String bagofcaramel = " пакет карамелек ";
        private String whose = "";
        private String whom = "";

        public void give(String whom, Person c) {
            whose = " карамельки " + c.toString() + "a";
            this.whom = whom;
            System.out.println("подарил " + this.whom + bagofcaramel);
        }

        public String giveWhose() {
            return whose;
        }

        @Override
        public String toString() {
            return bagofcaramel;
        }
    }

    public void Wave(Person person) {
        String p = person.toString();
        class WhomNose {
            public void NosePerson(){
                System.out.print("Он помахал кульком перед самым носом " + p + "a" + ", чтобы его соблазнить");
            }
        }
        WhomNose whom = new WhomNose();
        whom.NosePerson();
        System.out.println(", и сказал не без задней мысли:");

    }

    @Override
    public String toString() {
        return name;
    }

}

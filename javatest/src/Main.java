import Action.*;
import Interface.*;
import Personality.*;
import Enum.*;
import Exception.*;

class Main {
    public static void main(String[] args) {
        PeachPit pit = new PeachPit("косточка");
        PropellerMan carlson = new PropellerMan("Карлсон");
        Boy boy = new Boy("Малыш");
        Sit s = new Sit();
        ToHide h = new ToHide();
        FigureOut f = new FigureOut();
        BadAdvice sovet = new BadAdvice();
        NotHappined actionNh = new NotHappined();
        Sigh sigh = new Sigh();
        Keep keep = new Keep();
        FilleAndRulle far = new FilleAndRulle("Филле и Рулле");
        Info giveUp = new Info() {
            @Override
            public void info() {
                if (Math.random() < 0.7) System.out.println("Однако Малыш не сдавался. ");
                else System.out.println("Однако Малыш почти не сдавался. ");
            }
        };

        Ulius ulius = new Ulius("Дядя Юлиус");
        Boy.Arm arm = boy.new Arm();
        CallPolice call = new CallPolice();
        Ulius.BagCaramels bagCaramels = new Ulius.BagCaramels();


        System.out.print(Difficult.SAYONTRUE.getTranslation());
        actionNh.notHappined(boy);
        sigh.takeASigh(boy);
        System.out.print(Time.ALLDAY.getTime());
        boy.setBreakHead(true);
        boy.isBreakHead();
        keep.protect(carlson, far);
        System.out.println("Может набрать в полицию?");
        int PhoneNumber = 911;
        String StrNumber = null;
        if (Math.random() > 0.7) PhoneNumber = 8918627;
        else if (Math.random() > 0.7) StrNumber = "not number";

        try{
            if (StrNumber != null)  call.callNumberPolice(StrNumber);
            else call.callNumberPolice(PhoneNumber);
            System.out.println("Нет, это не годится, потому что тогда обязательно придется объяснять, почему Филле и Рулле хотят поймать Карлсона, а это просто опасно.");
        }
        catch (PhoneNumberEsception e){
            System.err.println("Это не номер блеат, но главное, что не копы, молодец");
        }
        catch (PhoneRunTimeExeption a){
            a.policeCall();
        }

        System.out.print(Difficult.AVOT.getTranslation());
        carlson.setBreakHead(false);
        carlson.isBreakHead();
        System.out.print(Difficult.AND.getTranslation());
        carlson.setScare(false);
        carlson.isScare();
        carlson.he(true);
        carlson.setLocation(Location.WINDOW);
        carlson.stayHere();
        System.out.print(Difficult.AND.getTranslation());
        System.out.print(Difficult.UNRUFFLED_CALM.getTranslation());
        carlson.setDigUp(true);
        pit.setDug(carlson.isDigUp());
        System.out.print(Difficult.TO.getTranslation());
        f.figureOutTime(3);
        pit.howSprouted();
        System.out.print(Time.DAYN.getTime());
        System.out.print(Difficult.BUT.getTranslation());
        boy.setScare(true);
        boy.BoyWasAfraid(Difficult.INREALY);
        boy.setlurking(true);
        boy.BoyCounted(Difficult.WHATBETTER);
        boy.HeHope(Difficult.WHAT, s, carlson, Time.NIGHT, Location.HOUSE_ROOF);
        System.out.print(Difficult.WHAT.getTranslation());
        carlson.he(false);
        h.toHide();
        System.out.print(Difficult.BUT.getTranslation());
        System.out.print(carlson.toString());
        carlson.say();
        System.out.print(Difficult.WHAT.getTranslation());
        System.out.print(Difficult.FROMALL.getTranslation());
        System.out.print(sovet.toString());
        System.out.print(Difficult.WHICHGIVE.getTranslation());
        sovet.digreeBad(3);
        giveUp.info();
        System.out.println(ulius.toString());
        bagCaramels.give("ему", carlson);
        ulius.hopeConvice(carlson);
        ulius.Wave(carlson);
        arm.pushAway(carlson, boy, arm);



    }

}


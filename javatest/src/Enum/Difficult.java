package Enum;

public enum Difficult {

    AVOT("А вот ")
    ,AND(" и ")
    ,UNRUFFLED_CALM(" с невозмутимым спокойствием ")
    ,TO(", чтобы ")
    ,BUT("Но ")
    ,INREALY(" в самом деле ")
    ,WHATBETTER(", что лучше всего ")
    ,WHAT(", что ")
    ,FROMALL(" из всех ")
    ,WHICHGIVE(", которые ему давали ")
    ,SAYONTRUE(" По правде говоря, ")
    ;



    private String translation;

    Difficult(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

}

package Enum;

public enum Time {
    NIGHT(" эту ночь ")
    ,DAYN(" за сутки. ")
    ,ALLDAY("Весь день ")
    ;

    private final String Enum;

    Time(String Enum){
        this.Enum = Enum;
    }

    public String getTime(){
        return Enum;
    }
}

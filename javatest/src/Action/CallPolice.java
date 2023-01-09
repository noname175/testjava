package Action;

import Exception.*;


public class CallPolice {
    public int number;

    public void callNumberPolice(double number) throws PhoneRunTimeExeption {
        double n = number;
        if (n == 911) throw new PhoneRunTimeExeption();
        else System.out.println();
    }

    public void callNumberPolice(String number) throws PhoneNumberEsception{
        throw new PhoneNumberEsception("Это не номер");
    }
}



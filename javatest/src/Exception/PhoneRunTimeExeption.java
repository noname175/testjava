package Exception;

public class PhoneRunTimeExeption extends RuntimeException{
    public void policeCall(){
        System.err.println("копам набрал и все кабзда");
        System.exit(0);
    }
}


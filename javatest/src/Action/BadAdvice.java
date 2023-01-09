package Action;

public class BadAdvice {
    public void digreeBad(int c){
        if (c < 3) {
            switch (c) {
                case 0:
                    System.out.print("хороший своет ");
                    break;
                case 1:
                    System.out.print("нормальный совет");
                    break;
                case 2:
                    System.out.print("плохой совет");
                    break;
            }
        }
        else{
            System.out.print(", этот самый худший.");
        }
    }
    @Override
    public String toString(){
        return "дурных советов";
    }
}

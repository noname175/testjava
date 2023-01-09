package Action;

public class FigureOut extends Actions{

    public void figureOutTime(int c){
        if (c < 3) {
            switch (c) {
                case 0:
                    System.out.print("еще не вясняли");
                    break;
                case 1:
                    System.out.print("выяснить впервые");
                    break;
                case 2:
                    System.out.print("выяснить второй раз");
                    break;
            }
        }
        else{
                System.out.print("в очередной раз выяснить, ");
            }
        }


    @Override
    public String toString(){
        return "выяснить";
    }
}


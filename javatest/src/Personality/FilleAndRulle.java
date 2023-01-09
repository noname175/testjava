package Personality;

public class FilleAndRulle extends Person {
    public String name;
    public FilleAndRulle(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}

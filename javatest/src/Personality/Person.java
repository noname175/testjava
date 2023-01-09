package Personality;

public abstract class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }
    private boolean breakHead = false;

    public void isBreakHead() {
        if (breakHead) System.out.print(toString()+" "+"ломал себе голову");
        else System.out.print(toString()+" "+"не ломал себе голову");
    }

    public void setBreakHead(boolean breakHead) {
        this.breakHead = breakHead;
    }

    public String getName() {
        return name;
    }
    @Override
    public abstract String toString();
}

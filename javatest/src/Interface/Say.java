package Interface;
public interface Say {
    public void say();
    public default void gas() {
        System.out.println("Газ!");
    }
    public default void brake() {
            System.out.println("Тормоз!");

    }
}

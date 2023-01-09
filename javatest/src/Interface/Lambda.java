package Interface;

@FunctionalInterface
public interface Lambda {
    int calculate( int x, int y);

    default double sum(int x, int y) {
        return 0;
    }
}


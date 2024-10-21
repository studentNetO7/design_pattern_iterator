import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    private int min;
    private int max;

    public Randoms(int min, int max) {
        // проверим если числа введены корректно
        if (min >= max) {
            throw new IllegalArgumentException("min должно быть меньше чем max");
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(min, max);
    }
}
/**
 * Created by OskarPraca on 2017-03-18.
 */
public class MinMax<T> {
     private T firstValue;
     private T lastValue;

    public MinMax(T firstValue, T maxValue) {
        this.firstValue = firstValue;
        this.lastValue = maxValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public T getLastValue() {
        return lastValue;
    }

    public void setLastValue(T lastValue) {
        this.lastValue = lastValue;
    }
}

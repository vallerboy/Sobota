/**
 * Created by OskarPraca on 2017-03-18.
 */
public class GenericArray<T> {
    private T[] someArray;

    public GenericArray(T ... someArray){
        this.someArray = someArray;
    }

    public MinMax<T> getMinMax() {
        return new MinMax<>(someArray[0], someArray[someArray.length-1]);
    }
}

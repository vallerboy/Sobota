/**
 * Created by OskarPraca on 2017-03-18.
 */
public class Main {
    public static void main(String[] args) {


//        Pair<Integer, String> pair = new Pair<>(3, "Jan");
//        System.out.println(pair.getFirst() + " " + pair.getLast());
//
//        String name = pair.getLast();
//        int m = pair.getFirst();
//
//        pair.setLast(name + " Kowalski");
//        pair.setFirst(m + 1);
//
//        System.out.println(pair.getFirst() + " " + pair.getLast());


        GenericArray<Integer> genericArray = new GenericArray<>(412,32,3,2,4324,34,34);
        
        System.out.println("Last: " + genericArray.getMinMax().getLastValue() + ", First: "
                + genericArray.getMinMax().getFirstValue());






    }
}

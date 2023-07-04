import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        SetImitator setImitator = new SetImitator();

        System.out.println(".isEmpty:____________________");
        System.out.println(setImitator.isEmpty());

        System.out.println(".add:________________________");
        System.out.println(setImitator.add(9));
        System.out.println(setImitator.add(9));
        System.out.println(setImitator.add(9));
        System.out.println(setImitator.add(8));
        System.out.println(setImitator.add(1));

        System.out.println(".del:________________________");
        System.out.println(setImitator.del(9));
        System.out.println(setImitator.del(1));

        System.out.println(".size:_______________________");
        System.out.println(setImitator.size());

        System.out.println(".isEmpty:____________________");
        System.out.println(setImitator.isEmpty());

        System.out.println(".contains:___________________");
        System.out.println(setImitator.contains(9));
        System.out.println(setImitator.contains(8));

        System.out.println(".iterator:___________________");
        for (int i = 0; i < 10; i++) {
            setImitator.add(new Random().nextInt(1000));
        }

        Iterator<Integer> iterator = setImitator.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(".indexOf:____________________");
        System.out.println(setImitator.indexOf(5));


    }

}
class SetImitator <E> {
    private HashMap<E, Object> map = new HashMap<>();
    private static final Object OBJECT = new Object();

    public boolean add(E num) {
        return map.put(num, OBJECT) == null;
    }
    public boolean del(E num) {
        return map.remove(num, OBJECT);
    }

    public int size (){
        return map.size();
    }

    public boolean isEmpty (){
        return map.isEmpty();
    }

    public boolean contains(Object num){
        return map.containsKey(num);
    }

    public Iterator <E> iterator (){
        return map.keySet().iterator();
    }

    public E indexOf (int index){
        E[] mapArray = (E[]) map.keySet().toArray();
        return mapArray[index];
    }
}
import java.util.ArrayList;
import java.util.List;

public class RecursiveMaximum {

    public static int max(List<Integer> list){
        if(list.size() == 1){
            return list.get(0);	
        }
        int maximum = max(list.subList(1, list.size()));
        if(list.get(0) > maximum){
            return list.get(0);
        } else {
            return maximum;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(6);
        array.add(8);
        array.add(16);
        array.add(4);
        array.add(3);
        int maximum = max(array);
        System.out.println(maximum);
    }
}
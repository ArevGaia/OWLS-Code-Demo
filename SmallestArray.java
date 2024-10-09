public class SmallestArray{

    public static int[] smallest(int[] int_array){
        int smallest = int_array[0];
        int[] smallest_array = new int[2];
        smallest_array[0] = 0;
        smallest_array[1] = int_array[0];
        for (int i = 0; i < int_array.length; i++){
            if (int_array[i] < smallest){
                smallest = int_array [i];
                smallest_array[0] = i;
                smallest_array[1] = int_array[i];
            }
    }
    return smallest_array;
    }

    public static void main (String[] args){
        int[] new_array = {6, 8, 1, 4, 3};
        int [] small_array = smallest(new_array);
        for (int i = 0; i < 2; i++){
            System.out.println(small_array[i]);
        }
    }
}   
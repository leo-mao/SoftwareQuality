import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class BinaerSuchfunktion {
    public static void BinaerSuchfunktion(int key, int[] field, int low, int high, Result result){
        if (low == high) {
            if (field[low] == key) {
                result.found = true;
                result.index = low;
            }
            return;
        }
        int mid = (low + high) / 2;
        if (field[mid] == key){
            result.found = true;
            result.index = mid;
        }
        else if (field[mid] > key) {
            BinaerSuchfunktion(key, field, low, mid, result);
        }
        else if (field[mid] < key) {
            BinaerSuchfunktion(key, field, mid + 1, high, result);
        }
    }
    public static void main(String[] args){
        int[] field;
        Random random = new Random();
        int num = random.nextInt(20);
        ArrayList arrayList = new ArrayList<Integer>();
        Result result = new Result();


        for (int i = 0; i < num; i++ ){
            arrayList.add(random.nextInt(1000));
        }

        Collections.sort(arrayList);

        System.out.println(arrayList);
        field = arrayList.stream().mapToInt(i -> (int) i).toArray();

        int index = random.nextInt(num);
        System.out.printf("Richtige Index: %d, Suchte Zahl: %d", index, field[index]);
        System.out.println();
        BinaerSuchfunktion(field[index], field, 0, num - 1, result);
        System.out.println(result);
    }
}

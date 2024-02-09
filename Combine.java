import java.util.ArrayList;
import java.util.List;
public class Combine {
    public static void main(String[] args) {

        int[] arr1 = {11, 22, 33, 45};
        int[] arr2 = {1, 2, 3};

        int[] combined = CombineTwo(arr1,arr2);
//        (arr1, arr2);


        for (int num : combined) {
            System.out.print("The combined array is "+num + " ");
        }

    }


    public static int[] CombineTwo(int[] arr1, int[] arr2) {


        List<Integer> resultList = new ArrayList<>();
        int maxLength = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                resultList.add(arr1[i]);
            }
            if (i < arr2.length) {
                resultList.add(arr2[i]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}

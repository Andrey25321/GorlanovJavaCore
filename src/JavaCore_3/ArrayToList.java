package JavaCore3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 50, 100};
        String[] strArr = {"This", "is", "SPARTA", "!!!"};

        System.out.println("\nArray to list");
        System.out.println(arrayToList(intArr));
        System.out.println(arrayToList(strArr));
    }

    public static <A> List<A> arrayToList(A[] arr) {

        return new ArrayList<>(Arrays.asList(arr));
    }
}


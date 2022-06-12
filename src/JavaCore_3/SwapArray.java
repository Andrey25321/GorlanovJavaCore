package JavaCore3;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 50, 100};
        swapGenerics(intArr, 0,4);
        String[] strArr = {"This", "SPARTA", "is", "!!!"};
        swapGenerics(strArr, 1, 2);
    }

    public static <S> void swapGenerics(S[] arr, int i, int j) {
        if ((i < 0 || i >= arr.length) || (j < 0 || j >= arr.length)) {
            return;
        }
        System.out.println(Arrays.toString(arr));

        System.out.printf("элементы с индексом [%s] и [%s] поменялись местами\n", i, j);
        S temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
package Week_02.Repetitive_Even_Numbers;


public class Repetitive_even_n {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 5, 6, 10, 6, 26, 37, 94, 100, 6, 56};
        int[] duplicate_even = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((list[i] % 2 == 0) && (list[i] == list[j]) && i != j) {
                    if (!isFind(duplicate_even, list[i])) {
                        duplicate_even[startIndex++] = list[i];

                    }
                    break;
                }
            }
        }
        for (int value : duplicate_even) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}

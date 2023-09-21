package Week_02.Average_of_Harmonic_Numbers;

public class Harmonic_Mean {
    public static void main(String[] args) {

        int[] list = {1, 3, 5, 7, 9};
        double harmonic_value = 0;

        for (int i = 0; i < list.length; i++) {
            harmonic_value += (double) list[i] / (i + 1);

        }
        System.out.println(list.length / harmonic_value);
    }
}

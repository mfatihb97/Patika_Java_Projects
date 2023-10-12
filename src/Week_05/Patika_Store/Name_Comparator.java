package Week_05.Patika_Store;


import java.util.Comparator;

public class Name_Comparator implements Comparator<Brand> {


    @Override
    public int compare(Brand o1, Brand o2) {

        return o1.getBrandName().compareTo(o2.getBrandName());
    }

    @Override
    public Comparator<Brand> reversed() {
        return Comparator.super.reversed();
    }
}

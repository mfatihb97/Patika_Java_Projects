package Week_05.Patika_Store;

import java.util.TreeSet;

public class Brand {
    private int id;
    String brandName;

    public Brand(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public static void listBrand() {
        Brand brand1 = new Brand(1, "Samsung");
        Brand brand2 = new Brand(2, "Lenovo");
        Brand brand3 = new Brand(3, "Apple");
        Brand brand4 = new Brand(4, "Huawei");
        Brand brand5 = new Brand(5, "Casper");
        Brand brand6 = new Brand(6, "Asus");
        Brand brand7 = new Brand(7, "HP");
        Brand brand8 = new Brand(8, "Xiaomi");
        Brand brand9 = new Brand(9, "Monster");

        TreeSet<Brand> brandTree = new TreeSet<>(new Name_Comparator());

        brandTree.add(brand1);
        brandTree.add(brand2);
        brandTree.add(brand3);
        brandTree.add(brand4);
        brandTree.add(brand5);
        brandTree.add(brand6);
        brandTree.add(brand7);
        brandTree.add(brand8);
        brandTree.add(brand9);

        for (Brand brand : brandTree) {
            System.out.println("- " + brand.getBrandName());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}

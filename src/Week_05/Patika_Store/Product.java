package Week_05.Patika_Store;

import java.util.Comparator;

public abstract class Product {
    private int price;
    private int discountRate;
    private int stockCount;
    private String name;
    private String brand;
    private int memory;
    private double screenSize;
    private int RAM;

    public Product(int price, int discountRate, int stockCount, String name, String brand, int memory, double screenSize, int RAM) {
        this.price = price;
        this.discountRate = discountRate;
        this.stockCount = stockCount;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.RAM = RAM;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}

package shoeManiac;

class Shoes {
    private String color;
    private int size;
    private static int shoesNumber = 0;

    public Shoes(String parameter1, int parameter2) {
        this.color = parameter1;
        this.size = parameter2;
        shoesNumber++;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getShoesNumber() {
        return shoesNumber;
    }
    }

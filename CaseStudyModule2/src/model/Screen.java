package model;

public class Screen extends Material{
    private int inch;
    public Screen(){}

    public Screen(String id, String name, String manufacturer, double quantity, double price, int inch) {
        super(id, name, manufacturer, quantity, price);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "inch=" + inch +
                '}';
    }
}

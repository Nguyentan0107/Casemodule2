package model;

public class Screen extends Material{
    private int inch;

    public Screen(int inch) {
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}

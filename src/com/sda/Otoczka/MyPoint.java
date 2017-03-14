package com.sda.Otoczka;

import java.util.Arrays;

public class MyPoint {

    private int [] coor = new int[2];   // tablica trzymaja koordynaty punktu
    // zmienne 'x' i 'y' sa potrzebne zeby zapisac je w obiekcie, do ktorego pobieramy
    // dane punktu ze stosu
    private int x;
    private int y;
    private double alfa;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.coor[0] = x;
        this.coor[1] = y;
        this.alfa = (double)coor[1] / ((double)coor[0] + (double)coor[1]);
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public int[] getCoor() {
        return coor;
    }

    public double getAlfa() { return alfa; }

    @Override
    public String toString() {
        return Arrays.toString(coor);
    }
}

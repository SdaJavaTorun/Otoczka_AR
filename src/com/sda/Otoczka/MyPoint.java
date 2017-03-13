package com.sda.Otoczka;

import java.util.Arrays;

/* Created by Artur Rózgowski on 3/12/17 */
public class MyPoint {

    private int [] coor = new int[2];   // tablica trzymaja koordynaty punktu

    public MyPoint(int x, int y) {
        this.coor[0] = x;
        this.coor[1] = y;
    }

    public int[] getCoor() {
        return coor;
    }

    public int alfaDet (int [] coor) {
        return coor[1]/coor[0] + coor[1];
    }

    @Override
    public String toString() {
        return Arrays.toString(coor);
    }


}

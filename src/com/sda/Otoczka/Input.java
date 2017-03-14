package com.sda.Otoczka;

import java.util.Arrays;
import java.util.List;

public class Input {

    static MyPoint pA = new MyPoint(1, 1);
    static MyPoint pB = new MyPoint(10, 2);
    static MyPoint pC = new MyPoint(4, 3);
    static MyPoint pD = new MyPoint(8, 4);
    static MyPoint pE = new MyPoint(9, 5);
    static MyPoint pF = new MyPoint(7, 8);
    static MyPoint pG = new MyPoint(8, 10);
    static MyPoint pH = new MyPoint(3, 7);
    static MyPoint pI = new MyPoint(3, 9);
    static MyPoint pJ = new MyPoint(2, 5);
    static MyPoint pK = new MyPoint(2, 4);

    // lista przechowująca wszystkie punkty
    public static List<MyPoint> inputList () {
        return Arrays.asList (pA, pB, pC, pD, pE, pF, pG, pH, pI, pJ, pK);
    }
}

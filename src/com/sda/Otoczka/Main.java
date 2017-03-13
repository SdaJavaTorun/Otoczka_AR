package com.sda.Otoczka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<MyPoint> stack = new Stack<>(); // inicjacja stoku

        MyPoint pA = new MyPoint(1, 1);
        MyPoint pB = new MyPoint(10, 2);
        MyPoint pC = new MyPoint(4, 3);
        MyPoint pD = new MyPoint(8, 4);
        MyPoint pE = new MyPoint(9, 5);
        MyPoint pF = new MyPoint(7, 8);
        MyPoint pG = new MyPoint(8, 10);
        MyPoint pH = new MyPoint(3, 7);
        MyPoint pI = new MyPoint(3, 9);
        MyPoint pJ = new MyPoint(2, 5);

        ArrayList<MyPoint> pAll =
                new ArrayList<>(Arrays.asList(pA, pB, pC, pD, pE,
                                            pF, pG, pH, pI, pJ));

        int [] tab = new int[10];

        for (MyPoint mp: pAll) {
            System.out.println(mp.alfaDet(mp.getCoor()));
        }

        //pG.alfaDet(pG);

        Det det2 = new Det(pAll.get(0).getCoor(),
                            pAll.get(1).getCoor(),
                            pAll.get(2).getCoor());

        System.out.println(det2.detResult());

        for (int a = 0; a<pAll.size()-2; a++) {
            Det det = new Det(pAll.get(a).getCoor(),
                                pAll.get(a + 1).getCoor(),
                                pAll.get(a + 2).getCoor());

            if (det.detResult() > 0) {
                stack.push(pAll.get(a + 2));
                System.out.println("Punkt "
                        + pAll.get(a + 2).toString() + " leci na stos");
            } else {
                System.out.println("Usuwamy punkt "
                        + stack.peek() + " ze stosu");
                stack.pop();
            }
            det = null;
        }

        System.out.println("Punkty wewnatrz otoczki: " +
                Arrays.toString(stack.toArray()));
    }
}

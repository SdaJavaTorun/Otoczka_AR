package com.sda.Otoczka;

import java.util.*;

import static java.util.Comparator.*;

public class Main {

    public static void main(String[] args) {

        Stack<MyPoint> stack = new Stack<>(); // inicjacja stosu

        // sortowanie punktów po wielkosci alfa - najmniejszym kacie
        // w klasie Input definiujemy punkty
        Input.inputList().stream()
                .sorted(Comparator.comparingDouble(MyPoint::getAlfa));

        // odkladamy na stos 3 pierwsze punkty o najmniejszym kącie
        for (int p=0; p<2; p++) stack.push(Input.inputList().get(p));

        for (int i = 2; i<Input.inputList().size()-1; i++) {
            // do wyliczenia det() musimy odczytac wspolrzedne punktow na stosie
            // w odwrotnej kolejnosc i przechowac w obiektach klasy MyPoint
            MyPoint b = new MyPoint(stack.peek().getX(), stack.peek().getY());
            stack.pop();
            MyPoint a = new MyPoint(stack.peek().getX(), stack.peek().getY());
            stack.pop();

            Det det = new Det(a.getCoor(), b.getCoor(), Input.inputList().get(i+1).getCoor());
            // wczesniej pobrane punkty oddajemy na stos
            stack.push(a);
            stack.push(b);

            // jesli skrecamy w prawo to usuwamy punkt z otoczki
            if (det.detResult() < 0) stack.pop();
            // i na stos odkladamy nastepny punkt do sprawdzenia
            stack.push(Input.inputList().get(i+1));
        }
        System.out.println("Punkty tworzące otoczke: " + Arrays.toString(stack.toArray()));
    }
}

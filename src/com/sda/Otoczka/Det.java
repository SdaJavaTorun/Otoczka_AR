package com.sda.Otoczka;

/* Created by Artur Rózgowski on 3/13/17 */
/*
* Klasa ma sprawdzac wspolosiowosc punktów
* */
public class Det {

    private int [] tab1;
    private int [] tab2;
    private int [] tab3;

    public Det(int[] tab1, int[] tab2, int[] tab3) {
        this.tab1 = tab1;
        this.tab2 = tab2;
        this.tab3 = tab3;
    }

    public int detResult () {
        return tab1[0] * tab2[1] * tab3[1] +
                tab2[0] * tab3[1] +
                tab3[0] * tab1[1] -
                tab2[1] * tab3[0] -
                tab3[1] * tab1[0] -
                tab1[0] * tab2[1] * tab1[1];
    }


}

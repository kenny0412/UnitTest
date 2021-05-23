package com.app.kenny.unittest.calculadora;

public class Calculadora {
    /*
    //METODO/////////////////////////////////ESPECIFICACION////////////////////////////////////////////////////////////////
    int plus(               | Este metodo devuelve un int resultado de la suma de numero 1 y numero 2
            int numero1,     |
            int numero2)     |
   -------------------------------------------------------------------------------------------------------------------------
   int subtract(               | Este metodo devuelve un int resultado de la resta de numero 1 y numero 2
            int numero1,     |
            int numero2)     |
   -------------------------------------------------------------------------------------------------------------------------
   */

    private int result;

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}

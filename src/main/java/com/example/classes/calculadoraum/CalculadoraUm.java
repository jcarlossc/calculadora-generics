package com.example.classes.calculadoraum;

/**
 * Classe CalculadoraUm.
 * 
 * @author Carlos da Costa.
 * @version 1.0
 */
public class CalculadoraUm {
    
    /**
     * Método responsável por somar os valores.
     * 
     * @param <T>
     * @param numero1
     * @param numero2
     */
    public static <T extends Number> void somar(T numero1, T numero2) {
        System.out.printf("Resultado da soma: %.2f\n", numero1.doubleValue() + numero2.doubleValue());
    }

    /**
     * Método responsável por subtrair os valores.
     * 
     * @param <T>
     * @param numero1
     * @param numero2
     */
    public static <T extends Number> void subtrair(T numero1, T numero2) {
        System.out.printf("Resultado da subtração: %.2f\n", numero1.doubleValue() - numero2.doubleValue());
    }

    /**
     * Método responsável por multiplicar os valores.
     * 
     * @param <T>
     * @param numero1
     * @param numero2
     */
    public static <T extends Number> void multiplicar(T numero1, T numero2) {
        System.out.printf("Resultado da multiplicação: %.2f\n", numero1.doubleValue() * numero2.doubleValue());
    }

    /**
     * Método responsável por dividir os valores.
     * 
     * @param <T>
     * @param numero1
     * @param numero2
     */
    public static <T extends Number> void dividir(T numero1, T numero2) {
        System.out.printf("Resultado da divisão: %.2f\n", numero1.doubleValue() / numero2.doubleValue());
    }

    /**
     * Método responsável pela operação de potencializar o valor.
     * 
     * @param <T>
     * @param numero1
     * @param numero2
     */
    public static <T extends Number> void potencia(T numero1, T numero2) {
        System.out.printf("Resultado da potenciação: %.2f\n", Math.pow(numero1.doubleValue(), numero2.doubleValue()));
    }

    /**
     * Método responsável pela operação de raiz quadrada do valor.
     * 
     * @param <T>
     * @param numero1
     */
    public static <T extends Number> void raizQuadrada(T numero1) {
        System.out.printf("Resultado da raiz quadrada: %.2f\n", Math.sqrt(numero1.doubleValue()));
    }

    /**
     * Método responsável pela operação de raiz cúbica do valor.
     * 
     * @param <T>
     * @param numero1
     */
    public static <T extends Number> void raizCubica(T numero1) {
        System.out.printf("Resultado da raiz cúbica: %.2f\n", Math.cbrt(numero1.doubleValue()));
    }
}

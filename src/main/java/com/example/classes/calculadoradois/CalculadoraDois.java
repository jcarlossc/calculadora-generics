package com.example.classes.calculadoradois;

public class CalculadoraDois <T extends Number> {
    
        /**
     * Método responsável por somar os valores.
     * 
     * @param numero1
     * @param numero2
     * @return soma
     */
    public Double somar(T numero1, T numero2) {
        return numero1.doubleValue() + numero2.doubleValue();
    }

    /**
     * Método responsável por subtrair os valores.
     * 
     * @param numero1
     * @param numero2
     * @return subtração
     */
    public Double subtrair(T numero1, T numero2) {
        return numero1.doubleValue() - numero2.doubleValue();
    }

    /**
     * Método responsável por multiplicar os valores.
     * 
     * @param numero1
     * @param numero2
     * @return multiplicação
     */
    public Double multiplicar(T numero1, T numero2) {
        return numero1.doubleValue() * numero2.doubleValue();
    }

    /**
     * Método responsável por dividir os valores.
     * 
     * @param numero1
     * @param numero2
     * @return divisão
     */
    public Double dividir(T numero1, T numero2) {
        return numero1.doubleValue() / numero2.doubleValue();
    }

    /**
     * Método responsável pela operação de potencializar o valor.
     * 
     * @param numero1
     * @param numero2
     * @return potenciação
     */
    public Double potenciar(T numero1, T numero2) {
        return Math.pow(numero1.doubleValue(), numero2.doubleValue());
    }

    /**
     * Método responsável pela operação de raiz quadrada do valor.
     * 
     * @param numero1
     * @return raiz quadrada
     */
    public Double raizQuadrada(T numero1) {
        return Math.sqrt(numero1.doubleValue());
    }

    /**
     * Método responsável pela operação de raiz cúbica do valor.
     * 
     * @param numero1
     * @return
     */
    public Double raizCubica(T numero1) {
        return Math.cbrt(numero1.doubleValue());
    } 
}

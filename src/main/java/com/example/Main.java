package com.example;

import com.example.classes.calculadoradois.CalculadoraDois;
import com.example.classes.calculadoraum.CalculadoraUm;

public class Main {
    public static void main(String[] args) {
        
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("\n----------");
        stringBuilder1.append(" CLASSE CALCULADORAUM: USA INTEIRO, PONTO FLUTUANTE OU AMBOS ");
        stringBuilder1.append("----------\n");
        System.out.println(stringBuilder1);

        CalculadoraUm.somar(5.5, 3);
        CalculadoraUm.subtrair(5.5, 2);
        CalculadoraUm.multiplicar(5.5,3.0);
        CalculadoraUm.dividir(6.6, 2);
        CalculadoraUm.potencia(5.0,3);
        CalculadoraUm.raizQuadrada(5);
        CalculadoraUm.raizCubica(5);

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("\n----------");
        stringBuilder2.append(" CLASSE CALCULADORADOIS SETADA COMO TIPO PONTO FLUTUANTE(DOUBLE) ");
        stringBuilder2.append("----------\n");
        System.out.println(stringBuilder2);

        CalculadoraDois<Double> calculadoraDois = new CalculadoraDois<Double>();
        System.out.printf("Resultado da soma: %.2f\n", calculadoraDois.somar(5.0, 6.0));
        System.out.printf("Resultado da subtração: %.2f\n", calculadoraDois.subtrair(5.2,2.6));
        System.out.printf("Resultado da multiplicação: %.2f\n", calculadoraDois.multiplicar(5.2,2.6));
        System.out.printf("Resultado da divisão: %.2f\n", calculadoraDois.dividir(5.2,2.6));
        System.out.printf("Resultado da potenciação: %.2f\n", calculadoraDois.potenciar(5.0, 2.0));
        System.out.printf("Resultado da raiz quadrada: %.2f\n", calculadoraDois.raizQuadrada(5.0));
        System.out.printf("Resultado da raiz cúbica: %.2f\n", calculadoraDois.raizCubica(10.0));

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("\n----------");
        stringBuilder3.append(" CLASSE CALCULADORADOIS SETADA COMO TIPO INTEIRO(INTEGER) ");
        stringBuilder3.append("----------\n");
        System.out.println(stringBuilder3);

        CalculadoraDois<Integer> calculadoraDois1 = new CalculadoraDois<Integer>();
        System.out.printf("Resultado da soma: %.2f\n", calculadoraDois1.somar(5, 6));
        System.out.printf("Resultado da subtração: %.2f\n", calculadoraDois1.subtrair(5,2));
        System.out.printf("Resultado da multiplicação: %.2f\n", calculadoraDois1.multiplicar(5,2));
        System.out.printf("Resultado da divisão: %.2f\n", calculadoraDois1.dividir(5,2));
        System.out.printf("Resultado da potenciação: %.2f\n", calculadoraDois1.potenciar(5, 2));
        System.out.printf("Resultado da raiz quadrada: %.2f\n", calculadoraDois1.raizQuadrada(5));
        System.out.printf("Resultado da raiz cúbica: %.2f\n", calculadoraDois1.raizCubica(10));
    }
}
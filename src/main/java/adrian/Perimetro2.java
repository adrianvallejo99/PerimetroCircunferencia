/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adrian;

/**
 *
 * @author adrian
 */
public class Perimetro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Programa para calcular el perímetro de una circunferencia");

        //perimetro = 2 * PI * r;
        int radio = 20;
        final double PI = 3.14;
        double perimetro = 2 * radio * Math.PI;

        System.out.println("Radio: " + radio + "\nNúmero PI: " + PI + "\nPerímetro: " + perimetro);

    }

}

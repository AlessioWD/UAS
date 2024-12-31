/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;


public class Matematika {
    public void pertambahan(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void pengurangan(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void perkalian(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void pembagian(int a, int b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Pembagian dengan 0 tidak diizinkan.");
        }
    }
}

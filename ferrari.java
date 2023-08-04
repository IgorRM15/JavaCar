/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ferrari {
    /**
     *
     */
    private static final int V8 = 8;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.ano = 2023;
        ferrari.cor = "Preta";
        ferrari.motor = V8;
        ferrari.pneu = (String) "branco";

        System.out.println("Carro: ferrari ");
        System.out.println("ano: " + ferrari.ano);
        System.out.println("cor: " + ferrari.cor);
        System.out.println("motor: " + ferrari.motor);
        System.out.println("pneu: " + ferrari.pneu);
        ferrari.ligar();
        ferrari.drift();
        ferrari.turbo();
        ferrari.desligar();
    }
}

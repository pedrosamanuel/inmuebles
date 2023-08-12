/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package INMUEBLES;

public class Main {


    public static void main(String[] args) {
        Lote milote;
        milote = new Lote(123,"San martin",200.0f,100);
        System.out.println("El lote esta valuado en dolares "+ milote.valuar());
        Registro r;
        r = new Registro("Godoy Cruz", 12f);
        r.valuar(milote);
        r.registrar(milote,710, milote.getSuperficie(), milote.getDomicilio(), r);
        r.emitirBoletos();


    }
    
}

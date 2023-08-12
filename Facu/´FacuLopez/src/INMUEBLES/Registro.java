
package INMUEBLES;


import java.util.ArrayList;
import java.util.List;

public class Registro {
    public static float coefAvaluoEdificio = 10.0f;
    public String municipio;
    private float tasa;
    public List<Lote> inmuebles = new ArrayList<>();
    public List<Escritura> escrituras = new ArrayList<>();
    

    public Registro(String municipio, float tasa) {
        this.municipio = municipio;
        this.tasa = tasa;

    }
    public void registrar(Lote lote, Integer nro, int sup, String dom, Registro r){
        Escritura esc = new Escritura(nro, sup, dom);
        escrituras.add(esc);
        inmuebles.add(lote);
        lote.setInscripto(r);

    }

    public void emitirBoletos(){
        for (Lote l : inmuebles){
            System.out.println(l.getIdPadron());
            System.out.println(l.getDomicilio());
            System.out.println(l.getAvaluoxmt());
            System.out.println(l.getSuperficie());
        }
    }
    public void valuar (Lote lote) {

        System.out.println("el valor es: " + lote.valuar());
    }



    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }


    public float getTasa() {
        return tasa;
    }


    public void setCoefAvaluoEdificio(float coefAvaluoEdificio) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
    }


    public void setTasa(float tasa) {
        this.tasa = tasa;
    }




    







    
}



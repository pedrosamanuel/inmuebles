
package INMUEBLES;


public class Lote {
    public Registro inscripto;
    public Integer idPadron;
    private String domicilio;
    private float avaluoxmt;
    public int superficie;
    
    public Lote(Integer idPadron, String domicilio, float avaluoxmt, int superficie){
       this.idPadron= idPadron;
       this.domicilio = domicilio;
       this.avaluoxmt = avaluoxmt;
       this.superficie = superficie;
        
    }

 
    public float valuar () {
        return this.avaluoxmt * this.superficie;
    }

    public Registro getInscripto() {
        return inscripto;
    }

    public Integer getIdPadron() {
        return idPadron;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public float getAvaluoxmt() {
        return avaluoxmt;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setInscripto(Registro inscripto) {
        this.inscripto = inscripto;
    }




}


package toto.tarolo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class fordulo {
    
    private int ev;
    private int het;
    private int forduloaheten;
    private LocalDate datum;
    private List<eredmeny> eredmenyLista;
    private List<Talalat> Talalatok;

    

    public fordulo(int ev, int het, int forduloaheten, LocalDate datum) {
        this.ev = ev;
        this.het = het;
        this.forduloaheten = forduloaheten;
        this.datum = datum;
        this.eredmenyLista = new ArrayList<eredmeny>();
        this.Talalatok = new ArrayList<Talalat>();
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public void setForduloaheten(int forduloaheten) {
        this.forduloaheten = forduloaheten;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getEv() {
        return ev;
    }

    public int getHet() {
        return het;
    }

    public int getForduloaheten() {
        return forduloaheten;
    }

    public LocalDate getDatum() {
        return datum;
    }
    
    public List<eredmeny> getEredmenyek(){
        return eredmenyLista;
    }
    public List<Talalat> getTalalatok() {
        return Talalatok;
    }
}

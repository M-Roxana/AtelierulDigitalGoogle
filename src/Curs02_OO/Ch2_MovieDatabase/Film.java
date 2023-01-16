package Curs02_OO.Ch2_MovieDatabase;

import java.util.Arrays;
import java.util.List;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film (Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori ;
    }

    public String getNume() {
        return nume;
    }

    public List<Actor> getActori(){
        return Arrays.stream(actori).toList();
    }

    public boolean actoriCuVarstaPeste(int varsta) {
        return  Arrays.stream(actori).anyMatch(actor -> actor.getVarsta() > varsta);
    }
}

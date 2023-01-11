package curs02_oo.ch2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme){
       this.nume = nume;
       this.filme = filme;

    }

    public String getNume() {
        return nume;
    }

    public List<Film> getFilme() {
        return List.of(filme);
    }

    public int getNumarFilme(){
        return filme.length;
    }

    public boolean haveActor(String nume) {
        return Arrays.stream(filme)
                .map(Film::getActori)
                .flatMap(Collection::stream)
                .anyMatch(actor -> actor.getNume().equals(nume));
    }
}

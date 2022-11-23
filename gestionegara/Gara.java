package gestionegara;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gara {

    GregorianCalendar data = new GregorianCalendar();

    LocalTime ora = LocalTime.now();

    int n_piste=0;

    Pista piste[] = new Pista[n_piste];

    int n_atleti;

    Atleta atleti[] = new Atleta[n_atleti];
    

    public Gara(){

    }

    public Gara(int giorno, int mese, int anno, int ora, int minuti, int n_piste, int n_atleti, Pista piste[], Atleta atleti[]){

        this.data.set(anno, mese, giorno);

        this.ora = LocalTime.of(ora, minuti);

        for(int i=0; i<n_piste; i++)
        this.piste[i]=piste[i];

        for(int i=0; i<n_atleti; i++)
        this.atleti[i]=atleti[i];
    }


    public void setData(int anno, int mese, int giorno){

        this.data.set(anno, mese, giorno);
    }

    public GregorianCalendar getData(){

        return data;
    }


    public void setOra(int ora, int minuti){

        this.ora = LocalTime.of(ora, minuti);
    }

    public LocalTime getOra(){

        return ora;
    }
    
    public void setN_piste(int n_piste){

        this.n_piste=n_piste;
    }

    public void setPiste( Pista piste[]){

        for(int i=0; i<n_piste; i++)
        this.piste[i]=piste[];
    }

    public void setAllPiste(int n_piste, Pista piste[]){

        this.n_piste=n_piste;

        for(int i=0; i<n_piste; i++)
        this.piste[i]=piste[];
    }

    public Pista[] getPiste(){

        return piste;
    }

    public int getN_piste(){

        return n_piste;
    }

    
    public void setN_Atleti(int n_atleti){

        this.n_atleti=n_atleti;
    }

    public void setAtleti(Atleta atleti[]){

        for(int i=0; i<n_atleti; i++)
        this.atleti[i]=atleti[];
    }

    public void setAllAtleti(int n_atleti, Atleta atleti[]){

        this.n_atleti=n_atleti;

        for(int i=0; i<n_atleti; i++)
        this.atleti[i]=atleti[];
    }

    public int getN_Atleti(){

        return n_atleti;
    }

    public Atleta[] getAtleti(){

        return atleti;
    }
    
}

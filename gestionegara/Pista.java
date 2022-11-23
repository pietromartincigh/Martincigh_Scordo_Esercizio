package gestionegara;

public class Pista {
    int numero;
    String condizioni_pista;
    int lunghezza_pista;
    int n_corsie;

    public Pista(){}

    public Pista (int numero, String condizioni_pista, int lunghezza_pista, int n_corsie){
        this.numero=numero;
        this.condizioni_pista=condizioni_pista;
        this.lunghezza_pista=lunghezza_pista;
        this.n_corsie=n_corsie;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setCondizioni_pista(String condizioni_pista){
        this.condizioni_pista=condizioni_pista;
    }

    public String getCondizioni_pista(){
        return condizioni_pista;
    }

    public void setLunghezza_pista(int lunghezza_pista){
        this.lunghezza_pista=lunghezza_pista;
    }

    public int getLunghezza_pista(){
        return lunghezza_pista;
    }

    public void setN_corsie(int n_corsie){
        this.n_corsie=n_corsie;
    }

    public int getN_corsie(){
        return n_corsie;
    }

    @Override

    public String toString(){
        return ("Numero pista: " + numero + "\nCondizioni: " + condizioni_pista + "\nLunghezza: " + lunghezza_pista + "\nNumero corsie: " + n_corsie);
    }
    
}

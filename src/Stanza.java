public class Stanza implements Runnable {

    String nomeStanza;
    private double lunghezza, larghezza, altezza;

    public double areaDaRidipingere; 

    public Stanza(String nomeStanza, double lunghezza,double larghezza, double altezza){
        this.nomeStanza = nomeStanza;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    private double getPerimetro() {
        return 2 * larghezza + 2 * lunghezza;
    }

    private double getAreaParetiLaterali(){
        return getPerimetro() * altezza;
    }

    private double getAreaSoffitto() {
        return larghezza * lunghezza;
    }

    @Override
    public void run() {
        areaDaRidipingere = getAreaParetiLaterali() + getAreaSoffitto();
        System.out.println(nomeStanza + ": calcolo area da dipingere");
    }
   
}

public class CalcoloCostoTinteggiatura {
    public static void main(String[] args) throws InterruptedException  {

        final double ALTEZZA_APPARTAMENTO = 2.8;

        // creazione delle stanze
        Stanza cucina = new Stanza("cucina",4,3,ALTEZZA_APPARTAMENTO);
        Stanza bagno = new Stanza("bagno", 3,3,ALTEZZA_APPARTAMENTO);
        Stanza sala = new Stanza("sala", 5,4,ALTEZZA_APPARTAMENTO);
        Stanza cameraDaLetto = new Stanza("camera da letto",4,4,ALTEZZA_APPARTAMENTO);

        // creazione dei Thread di calcolo
        Thread calcoloCucina = new Thread (cucina);
        Thread calcoloBagno = new Thread (bagno);
        Thread calcoloSala = new Thread (sala);
        Thread calcoloCameraDaLetto = new Thread (cameraDaLetto);

        // fork dei Thread di calcolo
        calcoloCucina.start();
        calcoloBagno.start();
        calcoloSala.start();
        calcoloCameraDaLetto.start();
        
        // join dei Thread di calcolo
        calcoloCucina.join();
        calcoloBagno.join();
        calcoloSala.join();
        calcoloCameraDaLetto.join();

        // calcoli finali
        final double METRI_QUADRI_DA_RIDIPINGERE = cucina.areaDaRidipingere +
                                                    bagno.areaDaRidipingere + 
                                                    sala.areaDaRidipingere +
                                                    cameraDaLetto.areaDaRidipingere;

        final double COSTO_PITTURA_AL_METRO_QUADRO = 10;

        System.out.println("costo totale pittura: " + METRI_QUADRI_DA_RIDIPINGERE *COSTO_PITTURA_AL_METRO_QUADRO);
       
    }
}

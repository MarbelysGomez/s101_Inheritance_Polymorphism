package S101_N1exercise1;

public class Musical_Instruments {

    public static void main(String[] args) {

        System.out.println("Showing the number of instruments before creating the instances: " + Instrument.getNumberOfInstruments() + ".");
        System.out.println();

        Instrument windInstrument = new Wind_Instrument("Harmonic", 50);
        Instrument stringInstrument = new String_Instrument("Cuatro", 400);
        Instrument percussionInstrument = new Percussion_Instrument("Drums", 800);

        windInstrument.play();
        System.out.println(windInstrument);
        System.out.println();

        stringInstrument.play();
        System.out.println(stringInstrument);
        System.out.println();

        percussionInstrument.play();
        System.out.println(percussionInstrument);
        System.out.println();

        System.out.println("Showing the number of instruments after creating the instances: " + Instrument.getNumberOfInstruments() + ".");
    }
}

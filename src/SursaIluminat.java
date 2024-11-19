public class SursaIluminat {
    public double putere;
    public int durataViata;
    public String clasaEnergetica;
    public String producator;
    public int fluxLumina;

    //Constructor fara parametrii
    public SursaIluminat(){}

    //Constructori cu toti parametrii
    public SursaIluminat(double putere, int durataviata, String clasaEnergetica, String producator, int fluxLumina){
        this.putere=putere;
        this.durataViata=durataviata;
        this.clasaEnergetica=clasaEnergetica;
        this.producator=producator;
        this.fluxLumina=fluxLumina;
    }

    //Constructor de copiere
    public SursaIluminat(SursaIluminat other){
        this.putere= other.putere;;
        this.durataViata= other.durataViata;
        this.clasaEnergetica= other.clasaEnergetica;
        this.producator= other.producator;
        this.fluxLumina= other.fluxLumina;
    }

    //toString

    @Override
    public String toString() {
        return "SursaIluminat{" +
                "putere=" + putere +
                ", durataViata=" + durataViata +
                ", clasaEnergetica='" + clasaEnergetica + '\'' +
                ", producator='" + producator + '\'' +
                ", fluxLumina=" + fluxLumina +
                '}';
    }
}

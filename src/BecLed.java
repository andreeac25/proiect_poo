public class BecLed extends SursaIluminat{
    public int numarLeduri;
    public String culoareLumina;
    public String tipControl;
    public double timpPornire;
    public int indiceRandareCromatica;

    //Constructor fara parametrii
    public BecLed() {}

    //Constructor cu toti parametrii
    public BecLed(double putere, int durataViata, String clasaEnergetica, String producator, int fluxLuminos, int numarLeduri, String culoareLumina, String tipControl, double timpPornire, int indiceRandareCromatica){
        super(putere, durataViata, clasaEnergetica, producator, fluxLuminos);
        this.numarLeduri=numarLeduri;
        this.culoareLumina=culoareLumina;
        this.tipControl=tipControl;
        this.timpPornire=timpPornire;
        this.indiceRandareCromatica=indiceRandareCromatica;
    }

    //Cosntructor de copiere
    public BecLed(BecLed other){
        super(other);
        this.numarLeduri= other.numarLeduri;
        this.culoareLumina= other.culoareLumina;
        this.tipControl= other.tipControl;
        this.timpPornire= other.timpPornire;
        this.indiceRandareCromatica= other.indiceRandareCromatica;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+" BecLed{" +
                "numarLeduri=" + numarLeduri +
                ", culoareLumina='" + culoareLumina + '\'' +
                ", tipControl='" + tipControl + '\'' +
                ", timpPornire=" + timpPornire +
                ", indiceRandareCromatica=" + indiceRandareCromatica +
                '}';
    }
}

public class BecNeon extends SursaIluminat{
    public double diametruTub;
    public double lungimeTub;
    public boolean emisiiUV;
    public int frecventaFunctionare;
    public double volumGaz;


    //Constructor fara parametrii
    public BecNeon() {}

    public BecNeon(double putere, int durataViata, String clasaEnergetica, String producator, int fluxLuminos, double diametruTub, double lungimeTub, boolean emisiiUV, int frecventaFunctionare, double volumGaz) {
        super(putere, durataViata, clasaEnergetica, producator, fluxLuminos);
        this.diametruTub=diametruTub;
        this.lungimeTub=lungimeTub;
        this.emisiiUV=emisiiUV;
        this.frecventaFunctionare=frecventaFunctionare;
        this.volumGaz=volumGaz;
    }

    public BecNeon(BecNeon other) {
        super(other);
        this.diametruTub=other.diametruTub;
        this.lungimeTub=other.lungimeTub;
        this.emisiiUV=other.emisiiUV;
        this.frecventaFunctionare=other.frecventaFunctionare;
        this.volumGaz=other.volumGaz;
    }

    //toString


    @Override
    public String toString() {
        return super.toString()+" BecNeon{" +
                "diametruTub=" + diametruTub +
                ", lungimeTub=" + lungimeTub +
                ", emisiiUV=" + emisiiUV +
                ", frecventaFunctionare=" + frecventaFunctionare +
                ", volumGaz=" + volumGaz +
                '}';
    }
}

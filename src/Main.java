public class Main {
    public static void main(String[] args) {
        SursaIluminat sursa1=new SursaIluminat();
        SursaIluminat sursa2=new SursaIluminat(4,10000,"A+","Philips",300);
        SursaIluminat sursa3=new SursaIluminat(sursa2);

        BecLed becLed1=new BecLed();
        BecLed becLed2=new BecLed(4,15000,"A++","Osram",500,5,"alb cald","Comanda vocala",0.5,90);
        BecLed becLed3=new BecLed(becLed2);

        BecNeon becNeon1=new BecNeon();
        BecNeon becNeon2=new BecNeon(9,20000, "B","Samsung",1000,10,30,false,50,20);
        BecNeon becNeon3=new BecNeon(becNeon2);

    }
}

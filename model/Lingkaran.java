package model;

public class Lingkaran extends Object2D implements keyValueDetailable{
    
    public abstract double hitungLuas(double jarijari){
        super(jarijari);
        return hitungLuas(jarijari)
        2 * 3,14 * jarijari;

    }

    public abstract double hitungKeliling(double jarijari){
        super(jarijari);
        return hitungKeliling(jarijari)
        3,14 * (jarijari*jarijari);
    }
}

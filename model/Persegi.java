package model;

public class Persegi extends Object2D implements keyValueDetailable{
    
    public abstract double hitungLuas(double sisi){
        super(sisi);
        return hitungLuas(sisi)
        4 * sisi;

    }

    public abstract double hitungKeliling(double sisi){
        super(sisi);
        return hitungKeliling(sisi)
        sisi * sisi;
    }
    
}

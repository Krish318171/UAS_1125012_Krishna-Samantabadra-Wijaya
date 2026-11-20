package model;

public class Kubus extends Object3D implements keyValueDetailable{
    
    public abstract double hitungLuasPermukaan(double sisi){
        super(sisi);
        return hitungLuasPermukaan(sisi)
        6 * sisi;
    
    }

    public abstract double hitungVolume(sisi){
        super(sisi);
        return hitungVolume(sisi)
        sisi * sisi * sisi;
    }
}

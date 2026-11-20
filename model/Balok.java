package model;

public class Balok extends Object3D implements keyValueDetailable {
    
    public abstract double hitungLuasPermukaan(double panjang, double lebar, double tinggi){
        super(panjang, lebar, tinggi);
        return hitungLuasPermukaan(panjang, lebar, tinggi)
        panjang * lebar * tinggi;
    }

    public abstract double hitungVolume(double panjang, double lebar, double tinggi){
        super(panjang, lebar, tinggi);
        return hitungVolume(panjang, lebar, tinggi)
        panjang * lebar * tinggi;
    }
}

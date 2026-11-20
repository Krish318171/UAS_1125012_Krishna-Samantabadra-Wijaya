package model;

public class Object3D extends GObject implements keyValueDetailable{
 
    private double panjang;
    private double lebar;
    private double tinggi;
    private double sisi;
    private double jarijari;

    public Object3D(String label, double panjang, double lebar, double tinggi, double sisi, double jarijari){
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.sisi = sisi;
        this.jarijari = jarijari;
    }
    
    public abstract double hitungLuasPermukaan(){
        return hitungLuasPermukaan();
    }

    public abstract double hitungVolume(){
        return hitungVolume()
    }
}

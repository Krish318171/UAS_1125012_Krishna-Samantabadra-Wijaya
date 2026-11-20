package model;

public class Object2D extends GObject implements keyValueDetailable{
    private double panjang;
    private double lebar;
    private double sisi;
    private double jarijari;

    public Object2D(String label, double panjang, double lebar, double sisi, double jarijari){
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
        this.sisi = sisi;
        this.jarijari = jarijari;
    }



    public abstract double hitungLuas(){
        return hitungLuas();
    }

    public abstract double hitungKeliling(){
        return hitungKeliling();
    }
}

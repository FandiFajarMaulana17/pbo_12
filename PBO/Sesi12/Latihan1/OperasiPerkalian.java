package Latihan1;

public class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = a * b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian: " + c);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
public class sepatu {
    int kode;
    String tipe;
    String merk;
    int harga;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public sepatu(){
    }
    public sepatu(int kode, String tipe, String merk, int harga){
        this.kode = kode;
        this.tipe = tipe;
        this.merk = merk;
        this.harga = harga;
    }
}

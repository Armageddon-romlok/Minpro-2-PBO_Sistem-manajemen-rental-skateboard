/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Skateboard {
    protected String idSkateboard;
    protected String merk;
    protected double hargaSewa;

    public Skateboard(String idSkateboard, String merk, double hargaSewa) {
        this.idSkateboard = idSkateboard;
        setMerk(merk);
        setHargaSewa(hargaSewa);
    }

    public String getIdSkateboard() { return idSkateboard; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) {
        if (merk != null && !merk.trim().isEmpty()) {
            this.merk = merk;
        } else {
            System.out.println(">> Peringatan: Merk tidak boleh kosong! Menggunakan default 'Tidak Diketahui'.");
            this.merk = "Tidak Diketahui";
        }
    }

    public double getHargaSewa() { return hargaSewa; }
    public void setHargaSewa(double hargaSewa) {
        if (hargaSewa >= 10000) {
            this.hargaSewa = hargaSewa;
        } else {
            System.out.println(">> Peringatan: Harga sewa minimal Rp 10.000! Diset ke default Rp 50.000.");
            this.hargaSewa = 50000;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID Skateboard : " + idSkateboard);
        System.out.println("Merk          : " + merk);
        System.out.println("Harga / Hari  : Rp " + hargaSewa);
    }
}

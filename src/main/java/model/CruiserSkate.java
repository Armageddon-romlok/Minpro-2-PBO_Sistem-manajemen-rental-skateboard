/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class CruiserSkate extends Skateboard {
    private String panjangPapan; // Contoh: 27 inch

    public CruiserSkate(String idSkateboard, String merk, double hargaSewa, String panjangPapan) {
        super(idSkateboard, merk, hargaSewa);
        setPanjangPapan(panjangPapan);
    }

    public String getPanjangPapan() {
        return panjangPapan;
    }

    public void setPanjangPapan(String panjangPapan) {
        if (panjangPapan == null || panjangPapan.trim().isEmpty()) {
            this.panjangPapan = "28 inch";
        } else {
            this.panjangPapan = panjangPapan;
        }
    }

    public void tampilkanDetailCruiser() {
        System.out.println("Tipe Papan    : Cruiser Skate");
        System.out.println("ID Papan      : " + getIdSkateboard());
        System.out.println("Merk          : " + getMerk());
        System.out.println("Tarif Sewa/Hari: Rp " + getHargaSewa());
        System.out.println("Panjang Papan : " + getPanjangPapan());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class CruiserSkate extends Skateboard {
    private String panjangPapan;

    public CruiserSkate(String idSkateboard, String merk, double hargaSewa, String panjangPapan) {
        super(idSkateboard, merk, hargaSewa);
        setPanjangPapan(panjangPapan);
    }

    public String getPanjangPapan() { return panjangPapan; }
    public void setPanjangPapan(String panjangPapan) {
        if (panjangPapan != null && !panjangPapan.trim().isEmpty()) {
            this.panjangPapan = panjangPapan;
        } else {
            this.panjangPapan = "28 inch (Default)";
        }
    }

    public void tampilkanInfoCruiser() {
        System.out.println("------------------------------------------");
        System.out.println("[KATEGORI: CRUISER SKATE]");
        super.tampilkanInfo();
        System.out.println("Panjang Papan : " + panjangPapan);
        System.out.println("------------------------------------------");
    }
}

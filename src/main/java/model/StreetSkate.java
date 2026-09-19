/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class StreetSkate extends Skateboard {
    private String ukuranRoda; // Contoh: 52mm

    public StreetSkate(String idSkateboard, String merk, double hargaSewa, String ukuranRoda) {
        super(idSkateboard, merk, hargaSewa);
        setUkuranRoda(ukuranRoda);
    }

    public String getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(String ukuranRoda) {
        if (ukuranRoda == null || ukuranRoda.trim().isEmpty()) {
            this.ukuranRoda = "52mm";
        } else {
            this.ukuranRoda = ukuranRoda;
        }
    }

    public void tampilkanDetailStreet() {
        System.out.println("Tipe Papan    : Street Skate");
        System.out.println("ID Papan      : " + getIdSkateboard());
        System.out.println("Merk          : " + getMerk());
        System.out.println("Tarif Sewa/Hari: Rp " + getHargaSewa());
        System.out.println("Ukuran Roda   : " + getUkuranRoda());
    }
}
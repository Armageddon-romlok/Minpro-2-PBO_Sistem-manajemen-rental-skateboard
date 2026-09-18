/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class StreetSkate extends Skateboard {
    private String ukuranRoda;

    public StreetSkate(String idSkateboard, String merk, double hargaSewa, String ukuranRoda) {
        super(idSkateboard, merk, hargaSewa);
        setUkuranRoda(ukuranRoda);
    }

    public String getUkuranRoda() { return ukuranRoda; }
    public void setUkuranRoda(String ukuranRoda) {
        if (ukuranRoda != null && !ukuranRoda.trim().isEmpty()) {
            this.ukuranRoda = ukuranRoda;
        } else {
            this.ukuranRoda = "52mm (Default)";
        }
    }

    public void tampilkanInfoStreet() {
        System.out.println("------------------------------------------");
        System.out.println("[KATEGORI: STREET SKATE]");
        super.tampilkanInfo();
        System.out.println("Ukuran Roda   : " + ukuranRoda);
        System.out.println("------------------------------------------");
    }
}

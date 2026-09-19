/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Penyewa {
    private String idRental;
    private String namaPenyewa;
    private int lamaSewa; // dalam hari
    private Skateboard skateboard; // Objek polymorph/induk (bisa StreetSkate/CruiserSkate)

    public Penyewa(String idRental, String namaPenyewa, int lamaSewa, Skateboard skateboard) {
        setIdRental(idRental);
        setNamaPenyewa(namaPenyewa);
        setLamaSewa(lamaSewa);
        this.skateboard = skateboard;
    }

    public String getIdRental() {
        return idRental;
    }

    public void setIdRental(String idRental) {
        if (idRental == null || idRental.trim().isEmpty()) {
            this.idRental = "RNT-000";
        } else {
            this.idRental = idRental;
        }
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        if (namaPenyewa == null || namaPenyewa.trim().isEmpty()) {
            this.namaPenyewa = "Anonim";
        } else {
            this.namaPenyewa = namaPenyewa;
        }
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        if (lamaSewa <= 0) {
            this.lamaSewa = 1; // Minimal 1 hari
        } else {
            this.lamaSewa = lamaSewa;
        }
    }

    public Skateboard getSkateboard() {
        return skateboard;
    }

    public void setSkateboard(Skateboard skateboard) {
        this.skateboard = skateboard;
    }

    public double hitungTotalBiaya() {
        return lamaSewa * skateboard.getHargaSewa();
    }
}
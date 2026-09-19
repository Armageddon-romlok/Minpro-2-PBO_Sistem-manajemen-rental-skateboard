/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Skateboard {
    protected String idSkateboard;
    protected String merk;
    protected double hargaSewa; // per hari

    public Skateboard(String idSkateboard, String merk, double hargaSewa) {
        setIdSkateboard(idSkateboard);
        setMerk(merk);
        setHargaSewa(hargaSewa);
    }

    public String getIdSkateboard() {
        return idSkateboard;
    }

    public void setIdSkateboard(String idSkateboard) {
        if (idSkateboard == null || idSkateboard.trim().isEmpty()) {
            this.idSkateboard = "SKT-UNKNOWN";
        } else {
            this.idSkateboard = idSkateboard;
        }
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        if (merk == null || merk.trim().isEmpty()) {
            this.merk = "Tanpa Merk";
        } else {
            this.merk = merk;
        }
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        if (hargaSewa < 10000) {
            this.hargaSewa = 10000;
        } else {
            this.hargaSewa = hargaSewa;
        }
    }
}

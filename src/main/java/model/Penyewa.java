/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Penyewa {
    private String noIdentitas;
    private String namaPenyewa;
    private String noHp;

    public Penyewa(String noIdentitas, String namaPenyewa, String noHp) {
        this.noIdentitas = noIdentitas;
        this.namaPenyewa = namaPenyewa;
        this.noHp = noHp;
    }

    public String getNoIdentitas() { return noIdentitas; }
    public String getNamaPenyewa() { return namaPenyewa; }
    public String getNoHp() { return noHp; }
}

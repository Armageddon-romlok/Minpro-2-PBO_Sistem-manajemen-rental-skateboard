/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.CruiserSkate;
import model.Skateboard;
import model.StreetSkate;
import java.util.ArrayList;

public class SkateboardService {
    private ArrayList<Skateboard> daftarSkateboard;

    public SkateboardService() {
        daftarSkateboard = new ArrayList<>();
        isiDummyData();
    }

    // Dummy data agar langsung tampil saat fitur Read dijalankan
    private void isiDummyData() {
        daftarSkateboard.add(new StreetSkate("SKT-01", "Element", 50000, "52mm"));
        daftarSkateboard.add(new CruiserSkate("CRS-01", "Penny", 45000, "27 inch"));
    }

    public ArrayList<Skateboard> getDaftarSkateboard() {
        return daftarSkateboard;
    }

    public void tambahSkateboard(Skateboard skateboardBaru) {
        daftarSkateboard.add(skateboardBaru);
        System.out.println(">> Data berhasil ditambahkan ke dalam sistem!");
    }

    public boolean hapusSkateboard(String idSkateboard) {
        for (int i = 0; i < daftarSkateboard.size(); i++) {
            if (daftarSkateboard.get(i).getIdSkateboard().equalsIgnoreCase(idSkateboard)) {
                daftarSkateboard.remove(i);
                return true;
            }
        }
        return false;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.CruiserSkate;
import model.Penyewa;
import model.Skateboard;
import model.StreetSkate;

public class SkateboardService {
    private ArrayList<Penyewa> daftarRental;

    public SkateboardService() {
        daftarRental = new ArrayList<>();
        inisialisasiDummyData();
    }

    private void inisialisasiDummyData() {
        // Dummy 1: Rental Street Skate
        Skateboard s1 = new StreetSkate("SKT-01", "Element", 50000.0, "52mm");
        daftarRental.add(new Penyewa("RNT-01", "Farel Wijaya", 2, s1));

        // Dummy 2: Rental Cruiser Skate
        Skateboard s2 = new CruiserSkate("CRS-01", "Penny Board", 45000.0, "27 inch");
        daftarRental.add(new Penyewa("RNT-02", "Budi Santoso", 3, s2));
    }

    public ArrayList<Penyewa> getDaftarRental() {
        return daftarRental;
    }

    public boolean isIdRentalAda(String idRental) {
        for (Penyewa p : daftarRental) {
            if (p.getIdRental().equalsIgnoreCase(idRental)) {
                return true;
            }
        }
        return false;
    }

    public void tambahRental(Penyewa penyewa) {
        daftarRental.add(penyewa);
    }

    public boolean updateLamaSewa(String idRental, int lamaSewaBaru) {
        for (Penyewa p : daftarRental) {
            if (p.getIdRental().equalsIgnoreCase(idRental)) {
                p.setLamaSewa(lamaSewaBaru);
                return true;
            }
        }
        return false;
    }

    public boolean hapusRental(String idRental) {
        for (int i = 0; i < daftarRental.size(); i++) {
            if (daftarRental.get(i).getIdRental().equalsIgnoreCase(idRental)) {
                daftarRental.remove(i);
                return true;
            }
        }
        return false;
    }
}
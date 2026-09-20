<img width="436" height="235" alt="{03B2E75D-7154-4A72-A9F4-15FA6382F022}" src="https://github.com/user-attachments/assets/31174466-62e0-4a33-92e5-ba44842484ea" />

Saat program dijalankan, sistem menampilkan antarmuka berbasis konsol yang menyediakan lima menu utama untuk mengelola transaksi rental skateboard, mencakup operasi penambahan data (Create), penampilan riwayat sewa (Read), pembaruan durasi hari (Update), penghapusan data (Delete), serta opsi untuk keluar dari aplikasi. Seluruh pembacaan input menu ini telah diproteksi menggunakan blok try-catch guna menangani InputMismatchException, sehingga jika pengguna memasukkan karakter selain angka, program tidak akan mengalami crash melainkan langsung menampilkan pesan peringatan dan me-refresh tampilan menu.

<img width="472" height="541" alt="{7D6ECA6C-EFDB-41D9-A150-03A974B7EB57}" src="https://github.com/user-attachments/assets/a492d1f6-984f-4ad3-bf36-ea4ea237bb81" />

Saat pertama kali program dijalankan dan pengguna memilih opsi 2, sistem mengeksekusi operasi pembacaan data (Read) dengan melakukan iterasi terhadap ArrayList pada SkateboardService. Tampilan ini mengonfirmasi berjalannya inisialisasi dummy data awal, yaitu dua transaksi rental yang memuat masing-masing tipe turunan papan: transaksi RNT-01 dengan unit StreetSkate (atribut ukuran roda 52mm) serta transaksi RNT-02 dengan unit CruiserSkate (atribut panjang papan 27 inch). Sistem secara dinamis mengenali tipe objek melalui pengecekan instanceof untuk mencetak detail spesifik papan dan menghitung total biaya sewa berdasarkan perkalian tarif per hari dengan durasi sewa.


<img width="472" height="352" alt="{3C0D3B27-FEC6-4A02-BE72-E3A3F05BBF3D}" src="https://github.com/user-attachments/assets/90d37e4f-7eb7-46a4-9018-f0ebc02f30a7" />
<img width="479" height="776" alt="{6C079F66-EB4A-478E-AD2C-5801D17B46F8}" src="https://github.com/user-attachments/assets/eebb5b9d-a750-4c06-8130-9cf95530415e" />


<img width="437" height="144" alt="image" src="https://github.com/user-attachments/assets/038de5b8-e0f8-4901-a0ef-cf458f323e8c" />
<img width="488" height="233" alt="{15B473DF-1A5A-49C6-9D9C-15032D2B18E6}" src="https://github.com/user-attachments/assets/d15f5f6b-e860-47cb-bfb5-e8c1ff788efb" />


<img width="427" height="130" alt="{3DBAB719-C41B-4691-88EF-4C875570E601}" src="https://github.com/user-attachments/assets/28e1e4f6-5ce3-49de-80af-fe8bece1ae65" />
<img width="545" height="527" alt="{B35D8EAE-7ABA-4425-8496-56A57B767B1B}" src="https://github.com/user-attachments/assets/9e2a7916-cfc2-4fda-86bf-79077ca674ef" />


<img width="695" height="402" alt="{B9867F18-A226-4ACC-8DD4-FBA5F74CDD73}" src="https://github.com/user-attachments/assets/0cbe43d2-28f0-4e49-9e94-b43998e39ff8" />


<img width="436" height="235" alt="{03B2E75D-7154-4A72-A9F4-15FA6382F022}" src="https://github.com/user-attachments/assets/31174466-62e0-4a33-92e5-ba44842484ea" />

Saat program dijalankan, sistem menampilkan antarmuka berbasis konsol yang menyediakan lima menu utama untuk mengelola transaksi rental skateboard, mencakup operasi penambahan data (Create), penampilan riwayat sewa (Read), pembaruan durasi hari (Update), penghapusan data (Delete), serta opsi untuk keluar dari aplikasi. Seluruh pembacaan input menu ini telah diproteksi menggunakan blok try-catch guna menangani InputMismatchException, sehingga jika pengguna memasukkan karakter selain angka, program tidak akan mengalami crash melainkan langsung menampilkan pesan peringatan dan me-refresh tampilan menu.

<img width="472" height="541" alt="{7D6ECA6C-EFDB-41D9-A150-03A974B7EB57}" src="https://github.com/user-attachments/assets/a492d1f6-984f-4ad3-bf36-ea4ea237bb81" />

Saat pertama kali program dijalankan dan pengguna memilih opsi 2, sistem mengeksekusi operasi pembacaan data (Read) dengan melakukan iterasi terhadap ArrayList pada SkateboardService. Tampilan ini mengonfirmasi berjalannya inisialisasi dummy data awal, yaitu dua transaksi rental yang memuat masing-masing tipe turunan papan: transaksi RNT-01 dengan unit StreetSkate (atribut ukuran roda 52mm) serta transaksi RNT-02 dengan unit CruiserSkate (atribut panjang papan 27 inch). Sistem secara dinamis mengenali tipe objek melalui pengecekan instanceof untuk mencetak detail spesifik papan dan menghitung total biaya sewa berdasarkan perkalian tarif per hari dengan durasi sewa.


<img width="472" height="352" alt="{3C0D3B27-FEC6-4A02-BE72-E3A3F05BBF3D}" src="https://github.com/user-attachments/assets/90d37e4f-7eb7-46a4-9018-f0ebc02f30a7" />
<img width="479" height="776" alt="{6C079F66-EB4A-478E-AD2C-5801D17B46F8}" src="https://github.com/user-attachments/assets/eebb5b9d-a750-4c06-8130-9cf95530415e" />

Pada tahap ini dilakukan pengujian fungsi penambahan data (Create) yang dilanjutkan dengan pembacaan ulang (Read) untuk memvalidasi pembaruan memori. Pengguna memilih opsi 1 untuk mencatat transaksi rental baru dengan ID RNT-03 atas nama penyewa Luthfi selama 6 hari, serta memilih unit tipe Street Skate dengan ID SRT-02, merk Baker, tarif sewa Rp 66000.0, dan ukuran roda 52mm. Setelah data berhasil disimpan ke dalam ArrayList, pengguna memilih opsi 2 untuk menampilkan seluruh daftar transaksi. Keluaran konsol membuktikan bahwa data RNT-03 telah berhasil ditambahkan pada urutan ketiga dengan kalkulasi total biaya yang tepat sebesar Rp 396000.0 hasil perkalian tarif harian dan durasi sewa.


<img width="437" height="144" alt="image" src="https://github.com/user-attachments/assets/038de5b8-e0f8-4901-a0ef-cf458f323e8c" />
<img width="488" height="233" alt="{15B473DF-1A5A-49C6-9D9C-15032D2B18E6}" src="https://github.com/user-attachments/assets/d15f5f6b-e860-47cb-bfb5-e8c1ff788efb" />

Pada tahap ini, sistem menjalankan pengujian fitur pembaruan data (Update) melalui opsi 3 untuk mengubah durasi sewa pada transaksi RNT-03 dari yang semula 6 hari menjadi 9 hari. Nilai baru tersebut diproses melalui method updateLamaSewa pada SkateboardService dan divalidasi oleh setter kelas Penyewa sebelum memori diperbarui. Setelah notifikasi keberhasilan ditampilkan, pengguna kembali memilih opsi 2 (Read) untuk memverifikasi perubahan data. Tampilan konsol mengonfirmasi bahwa atribut durasi sewa pada data rental milik Luthfi telah berubah menjadi 9 hari, dan sistem secara otomatis mengkalkulasi ulang total biaya menjadi Rp 594000.0 hasil perkalian tarif harian Rp 66000.0 dengan durasi baru tersebut.


<img width="427" height="130" alt="{3DBAB719-C41B-4691-88EF-4C875570E601}" src="https://github.com/user-attachments/assets/28e1e4f6-5ce3-49de-80af-fe8bece1ae65" />
<img width="545" height="527" alt="{B35D8EAE-7ABA-4425-8496-56A57B767B1B}" src="https://github.com/user-attachments/assets/9e2a7916-cfc2-4fda-86bf-79077ca674ef" />

Pada tahap ini, sistem menguji fungsi penghapusan data (Delete) melalui opsi 4 dengan memasukkan ID Rental RNT-02. Method hapusRental pada SkateboardService melakukan pencarian elemen yang cocok di dalam ArrayList, lalu menghapus objek transaksi tersebut dan menampilkan notifikasi keberhasilan. Untuk memverifikasi proses tersebut, pengguna kembali memilih opsi 2 (Read). Hasil tampilan konsol membuktikan bahwa data RNT-02 (penyewa Budi Santoso dengan tipe papan Cruiser Skate) telah sepenuhnya terhapus dari memori, menyisakan dua transaksi aktif lainnya, yaitu RNT-01 dan RNT-03.


<img width="695" height="402" alt="{B9867F18-A226-4ACC-8DD4-FBA5F74CDD73}" src="https://github.com/user-attachments/assets/0cbe43d2-28f0-4e49-9e94-b43998e39ff8" />

Pada tahap akhir pengujian, pengguna memilih opsi 5 untuk keluar dari aplikasi. Sistem merespons instruksi tersebut dengan mengubah variabel kontrol perulangan while menjadi false, menutup objek Scanner, dan mencetak pesan terminasi program secara aman sebelum eksekusi ditutup dengan status BUILD SUCCESS.



Penanganan error:

1. Typo Huruf pada menu utama(try-catch)
Saat muncul Pilih menu (1-5):, ketik huruf (misal: a atau woi), lalu tekan Enter.

<img width="385" height="69" alt="{1E86FA48-A30C-491C-855A-C7BE1816ECD3}" src="https://github.com/user-attachments/assets/3b1141b0-16a8-4cfc-b977-eab488d6cfc8" />


2. Uji ID Rental yang duplikat
Pada Masukkan ID Rental:, ketik ID yang sudah ada di data, yaitu RNT-01, lalu tekan Enter.

<img width="498" height="129" alt="{70C73EC3-6B7E-4C12-911A-177B2CAC1C77}" src="https://github.com/user-attachments/assets/a1f09b88-2ad3-4c36-b1c4-da179f838f75" />


3.Uji Typo Huruf pada Angka Input
Pada Menu 1: Saat diminta Masukkan Lama Sewa (Hari): atau Masukkan Tarif Sewa per Hari:, ketik huruf (misalnya enam).

<img width="429" height="160" alt="{68A3C2BB-C981-4CF5-AD0F-757C35043D12}" src="https://github.com/user-attachments/assets/7d5c5fd4-d7f8-4983-91f7-617d94dee616" />


4.Uji ID Tidak Ditemukan (Menu 3 atau Menu 4)

<img width="434" height="63" alt="image" src="https://github.com/user-attachments/assets/c7b8996c-f69e-43ae-9006-bca7d1a27b38" />

<img width="575" height="149" alt="{5772C37D-5924-41F5-BF95-CA594DA704A9}" src="https://github.com/user-attachments/assets/898c4c3d-11a6-4b78-a1f7-2387a5fa1a06" />
<img width="538" height="86" alt="{6FC23287-4430-463F-A59F-22AAC1427F34}" src="https://github.com/user-attachments/assets/a553be92-675a-473c-85c1-cd9cde4318f3" />

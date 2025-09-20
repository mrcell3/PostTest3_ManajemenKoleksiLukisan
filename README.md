# PostTest3_ManajemenKoleksiLukisan
Nama: Marcela Persa Linthin

NIM: 2409116072

# Dokumentasi Perubahan Program

1. Model
   - Di kode awal, Lukisan adalah satu-satunya class di package Model. Di versi baru, Lukisan dijadikan superclass.
   - Ditambahkan 2 subclass: LukisanDigital dan LukisanKlasik.
     
   Dengan begini, LukisanDigital dan LukisanKlasik mewarisi atribut dan method dari Lukisan, lalu menambahkan ciri khasnya masing-masing (software untuk digital, media untuk klasik).

2. Service
   - Di kode awal, LukisanService hanya punya satu method untuk tambah lukisan (tambahLukisan()).
   - Di versi baru, ditambah 2 method terpisah: tambahLukisanKlasik() dan tambahLukisanDigital().
     
     Perubahan ini diperlukan supaya user bisa memasukkan data sesuai dengan jenis lukisan yang dipilih. Meskipun berbeda, kedua method ini tetap menyimpan data dalam ArrayList<Lukisan>, jadi list koleksi bisa menampung semua jenis lukisan (Klasik maupun Digital).

3. Main
   - Di kode awal, menu utama langsung ada pilihan CRUD (1–6).
   - Di versi baru, menu Tambah Lukisan (nomor 1) ditambahkan sub-menu:
     - 1 → Tambah Lukisan Klasik
     - 2 → Tambah Lukisan Digital
       
     Dengan cara ini, menu utama tetap ringkas (1–6), tapi inheritance terlihat ketika user memilih jenis lukisan yang ingin ditambahkan.


Kesimpulan:
- Di kode awal, tidak ada inheritance. Semua data ada di class Lukisan saja.
- Di versi baru, inheritance diterapkan dengan cara:
    - Lukisan sebagai superclass.
    - LukisanDigital & LukisanKlasik sebagai subclass.
    - Keyword extends dipakai untuk mewarisi atribut & method dari Lukisan.
    - Keyword super(...) dipakai di constructor subclass untuk memanggil constructor superclass.
    - Method toString() dioverride di masing-masing subclass untuk menampilkan atribut tambahan.

1. Tambah
<img width="410" height="734" alt="image" src="https://github.com/user-attachments/assets/11fac8cc-811f-4603-9efd-38c5d734a15a" />

<img width="430" height="422" alt="image" src="https://github.com/user-attachments/assets/e34f9441-63f1-4777-ac77-e98f9bdb4310" />

2. Lihat
<img width="801" height="227" alt="image" src="https://github.com/user-attachments/assets/e353f97f-1784-4d3a-8e4e-e8adcbefa196" />

3. Update
<img width="819" height="519" alt="image" src="https://github.com/user-attachments/assets/6d1a6c04-9846-4f8d-a6ec-787e75269dea" />

4. Hapus
<img width="832" height="442" alt="image" src="https://github.com/user-attachments/assets/37bbf58e-af80-4868-9a78-9f3a6ee37391" />

5. Cari
<img width="835" height="233" alt="image" src="https://github.com/user-attachments/assets/55ce1139-3a64-4718-9bcd-bb0b7e748a46" />

6. Keluar
<img width="433" height="204" alt="image" src="https://github.com/user-attachments/assets/a6f9ec0b-8a00-426f-954e-79daf322cca6" />

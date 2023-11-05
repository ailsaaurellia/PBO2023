# PUBLIC, PRIVATE, PROTECTED, DAN REFACTOR
Kata kunci public, private, dan protected dalam pemrograman disebut sebagai "Akses Modifier". Mereka digunakan untuk mengatur tingkat visibilitas dan aksesibilitas dari atribut, metode, atau kelas dalam program Anda.
1. Akses modifier public dapat diakses dari mana saja, baik dari dalam kelas yang sama, kelas yang berbeda di dalam package yang sama, atau dari luar package.
2. Akses modifier private hanya dapat diakses dari dalam kelas yang sama di mana elemen tersebut didefinisikan.
3. Akses modifier protected dapat diakses dari dalam kelas yang sama, kelas turunan (subclass), dan juga kelas di dalam package yang sama.

Refactor adalah tindakan atau operasi yang membantu Anda memperbaiki, mengorganisir ulang, atau memperbaiki kode sumber Anda dengan lebih efisien dan aman.

# TAHAPAN-TAHAPAN 
1. Create New Project dengan nama “TugasPBO1” dan package "tugaspbo1"
2. Create Main Class dengan nama “MakhlukHidup1” pada Netbeans. Class MakhlukHidup1 ini meruapakan superclass yang sifatnya akan diturunkan kepada kelas turunannya.
3. Dalam Main Class buatlah atribut dengan akses “public” yang dapat diakses darimana saja.
4. Dan buatlah atribut dengan akses “protected” yang hanya bisa diakses dalam package yang sama.
5. Cara mengubah atribut dengan akses “public” ke akses “private” kita bisa melakukan refactor dengan mengeblok atribut “public” dahulu lalu klik kanan pada mouse kita, pilih refaktor dan klik Encapsulate Field.
6. Lalu, agar method protected dari Class MakhlukHidup1 dapat diturunkan di Class lain, kita bisa melakukan extend dengan membuat Class baru dengan nama Hewan1. Lalu pada pilihan super class kita klik browse dan ketik MakhlukHidup1 dan finish.
7. Class Hewan1 extend MakhlukHidup1 ini akan menjadi turunan dari Class MakhlukHidup1 dan class turunan ini yang dapat meakses method protected dari Class MakhlukHidup1.
8. Selanjutnya, kita bisa membuat Class baru dengan nama Penguin dimana class ini akan menjadi main class. Class ini berisi klasifikasi karakteristik Penguin.
9. Pada Class Penguin bisa dituliskan main, lalu tuliskan juga isi dari variable variabel dengan menggunakan set. Setelah itu, kita tuliskan juga kode untuk memanggil variabel variabel nya. Untuk yang protected bisa dituliskan variabel nya tanpa get&set.
10. Terakhir, melakukan run project untuk melihat outputnya, method yang menggunakan akses “protected” bisa diakses karena Class Hewan1 sudah di extends dengan Class MakhlukHidup1. Class MakhlukHidup1, Class Hewan1 dan Class Penguin juga berada pada package yang sama. 

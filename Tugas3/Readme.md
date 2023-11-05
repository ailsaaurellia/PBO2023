# INTERFACE
Interface adalah Class yang tidak memilki tubuh pada method-methodnya karena method tersebut harus diimplementasikan dalam kelas turunan nya. Jadi, interface berfungsi sebagai penghubung antara sesuatu yang ‘abstrak’ dengan sesuatu yang nyata.

# METHOD OVERRIDE dan METHOD OVERLOAD
Method override adalah sebuah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class. Sedangkan Method overload adalah method yang memilki nama variabel yang sama dalam satu Class namun, parameternya yang berbeda.

# TAHAPAN-TAHAPAN
1. Buatlah diagram dengan Main Class Hewan beserta turunannya yaitu Kambing dan Komodo dengan Interface pada kelas Kambing (Herbivora, Bergerak, dan Bersuara).
2. Pada aplikasi Netbeans, kita membuat New Project dengan nama Main Class Hewan dan lakukan refactor pada atribut public didalam kelas Hewan untuk diubah menjadi atribut private.
3. Ketiklah Konstruktor parameter dan Overload yang akan digunakan secara manual pada kelas Hewan.
4. Buatlah kelas turunan dengan nama Kambing dan Komodo lalu di extends dengan main class Hewan dengan cukup menambahkan keyword “extends”, lalu ketiklah manual konstruktor pada kelas turunan Kambing dan Komodo.
5. Setelah itu membuat 3 Interface untuk kelas turunan Kambing yaitu (Herbivora,Gerak, dan Suara) dengan cara klik kanan pada package hewan lalu klik New Java Interface. Pada kelas Interface kita buat method public.
6. Jika kelas Kambing ingin mengimplementasikan method dari Interface maka cukup tambahkan keyword “implements” diikuti nama dari Interface tersebut. Kelas Kambing harus mengimplementasikan detail dari method" yang ada pada Interface.
7. lalu semua method pada kelas Kambing kita override ke method yang ada pada Interface dengan klik pentung panah kuning pada samping kiri.
8. Membuat package baru untuk memanggil method dengan nama kelas Utama. Selanjutnya kita harus menyantumkan import terhadap kelas Hewan, Kambing, dan Komodo agar dapat terbaca outputnya. Setelah itu kita merancang source code untuk output yang kita inginkan, tidak lupa disertakan set dan get nya agar bisa terbaca.
9. Selanjutnnya kita bisa melakukan run project pada class Utama untuk melihat bagaimana output yang kita rancang sebelumnya.

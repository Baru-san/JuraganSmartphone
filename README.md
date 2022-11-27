# JuraganSmartphone
Projek mengenai pembelian barang elektronik yang dilakukan secara online.

# Anggota Kelompok

		     1. Akbarul Ihsan         (2108107010044) (Ketua)
		     2. Ridho Ferdiansyah     (2108107010039)
		     3. Fanul Nastia          (2108107010029)  
		     4. Arrijalul Khairi      (21081070100)
		     5. Rahmi Susanti         (2008107010092)


# Penjelasan Projek
Pada projek ini kami membuat projek tentang pembelian barang elektronik secara online berbasis Java GUI. Program kami memiliki 5 tampilan, yang terdiri dari Register, Login, pertaturan, data pembeli, dan yang terakhir adalah Home. Untuk tambahan, kami membuat 1 file yang berfungsi menyimpan data pembeli yang telah diisi oleh user seperti saldo. 

1. Untuk tampilan awal, user akan diarahkan pada laman register untuk melakukan registrasi terlebih dahulu. Pada register, terdapat username dan password yang harus diisi oleh user, untuk memastikan password yang telah dibuat oleh user, kami menggunakan retype password, jdi jika user mengisi password yang berbeda, maka akan muncul perintah warning. Masing2 inputan akan disimpan dalam sebuah variabel baru.
2. Jika berhasil, user akan diarahkan menuju laman peraturan, untuk itu user diminta untuk membaca peraturannya terlebih dahulu. Dengan menekan oke user akan dialihkan menuju data nasabah. 
3. Pada data nasabah ini user wajib mengisi PIN serta saldo awal(minimal 100k). Kemudian data nasabah seperti saldo akan disimpan dalam sebuah file. Dengan adanya file ini, maka data nasabah tadi akan disimpan lalu akan dilakukan operasi untuk membaca dan menulis file. Pada kelas file, terdapat method getter dan setter agar kita dapat memperoleh data saldo yang terbaru. Untuk saldo, akan dilakukan casting dari string ke integer agar memudahkan dalam membuat kondisi untuk melakuka transaksi.
4. Kemudian setelah itu, user akan dialihkan menuju laman login. Pada login juga terdapat kondisi untuk pengecekan apakah username ataupun password yang diinput oleh user sama pada saat registrasi tadi. Jika iya, maka user berhasil menuju home.   

# Link Presentasi YouTube

# cara run program
	1. Clone repository
	https://github.com/Baru-san/JuraganSmartphone.git

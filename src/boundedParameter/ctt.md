# BOUNDED PARAMETER

¥ Bounded Type Parameter

1. Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
2. Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
3. Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class-class turunannya
4. Secara default, constraint type untuk generic parameter type adalah Object, sehingga semua tipe data bisa digunakan

¥ Multiple Bounded Type Parameter

1. Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
2. Kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama
3. Jika ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi


Pertanyaan 2.1.3
1. sudah
2. Stack dapat menampung 5 data tugas mahasiswa
StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
3. Pengecekan !isFull() diperlukan untuk mencegah ArrayIndexOutOfBoundsException. 
4. sudah
5. sudah
6. sudah

Pertanyaan 2.2.3
1. Method ini bekerja dalam dua tahap menggunakan prinsip Stack:
Tahap 1 — Push sisa pembagian:
Selama nilai > 0, hitung sisa nilai % 2 lalu push ke StackKonversi, kemudian nilai = nilai / 2. Proses ini menghasilkan bit-bit dari LSB (Least Significant Bit) ke MSB.
Tahap 2 — Pop untuk susun biner:
Karena Stack bersifat LIFO, saat di-pop urutan menjadi terbalik (MSB keluar pertama), sehingga String yang terbentuk adalah representasi biner yang benar dari kiri ke kanan.
2. Untuk input positif normal (seperti nilai 0–100), hasilnya sama persis. Kondisi nilai > 0 dan nilai != 0 berperilaku identik karena nilai tugas tidak pernah negatif.

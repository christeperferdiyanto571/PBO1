#include <iostream>
using namespace std;

int main() {
    char ulangi;

    do {
        int baris, kolom;
        cout << "Masukkan jumlah baris matriks: ";
        cin >> baris;
        cout << "Masukkan jumlah kolom matriks: ";
        cin >> kolom;

        int nilai[baris][kolom];
        int total = 0;
        int nilaiSatuDimensi[baris * kolom]; // Array satu dimensi untuk menyimpan nilai-nilai matriks.

        // Meminta pengguna untuk memasukkan elemen-elemen matriks.
        cout << "Masukkan elemen-elemen matriks:" << endl;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                cout << "Masukkan nilai baris ke-" << i + 1 << " kolom ke-" << j + 1 << ": ";
                cin >> nilai[i][j];
                nilaiSatuDimensi[i * kolom + j] = nilai[i][j]; // Menyimpan nilai dalam array satu dimensi.
                total += nilai[i][j];
            }
        }

        // Menghitung rata-rata nilai matriks.
        double rata_rata = static_cast<double>(total) / (baris * kolom);

        system("cls");

        // Menampilkan matriks yang dimasukkan oleh pengguna.
        cout << "Matriks yang dimasukkan:" << endl;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                cout << nilai[i][j] << " ";
            }
            cout << endl;
        }

        // Menampilkan rata-rata nilai matriks.
        cout << "Rata-rata nilai matriks: " << rata_rata << endl;

        // Menampilkan nilai-nilai dalam array satu dimensi.
        cout << "Nilai-nilai dalam array satu dimensi:" << endl;
        for (int i = 0; i < baris * kolom; i++) {
            cout << nilaiSatuDimensi[i] << " ";
        }
        cout << endl;
		
        // Meminta pengguna apakah ingin menghitung rata-rata lagi.
        cout << "Hitung rata-rata lagi? (y/n): ";
        cin >> ulangi;

        // Tambahkan pernyataan if untuk keluar dari loop jika pengguna memilih 'n' atau 'N'.
        if (ulangi == 'n' || ulangi == 'N') {
            break;
        }

        system("cls");
        
    } while (ulangi == 'y' || ulangi == 'Y');

    return 0;
}

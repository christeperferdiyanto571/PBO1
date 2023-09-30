import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulangi;

        do {
            int baris, kolom;
            System.out.print("Masukkan jumlah baris matriks: ");
            baris = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            kolom = scanner.nextInt();

            int[][] nilai = new int[baris][kolom];
            int total = 0;
            int[] nilaiSatuDimensi = new int[baris * kolom];

            // Meminta pengguna untuk memasukkan elemen-elemen matriks.
            System.out.println("Masukkan elemen-elemen matriks:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Masukkan nilai baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                    nilai[i][j] = scanner.nextInt();
                    nilaiSatuDimensi[i * kolom + j] = nilai[i][j];
                    total += nilai[i][j];
                }
            }

            // Menghitung rata-rata nilai matriks.
            double rata_rata = (double) total / (baris * kolom);

            clearConsole();

            // Menampilkan matriks yang dimasukkan oleh pengguna.
            System.out.println("Matriks yang dimasukkan:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(nilai[i][j] + " ");
                }
                System.out.println();
            }

            // Menampilkan rata-rata nilai matriks.
            System.out.println("Rata-rata nilai matriks: " + rata_rata);

            // Menampilkan nilai-nilai dalam array satu dimensi.
            System.out.println("Nilai-nilai dalam array satu dimensi:");
            for (int i = 0; i < baris * kolom; i++) {
                System.out.print(nilaiSatuDimensi[i] + " ");
            }
            System.out.println();

            // Meminta pengguna apakah ingin menghitung rata-rata lagi.
            System.out.print("Hitung rata-rata lagi? (y/n): ");
            ulangi = scanner.next().charAt(0);

            // Tambahkan pernyataan if untuk keluar dari loop jika pengguna memilih 'n' atau 'N'.
            if (ulangi == 'n' || ulangi == 'N') {
                break;
            }

            clearConsole();

        } while (ulangi == 'y' || ulangi == 'Y');

        scanner.close();
    }

    // Metode untuk membersihkan konsol (hanya berfungsi di beberapa lingkungan)
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handle any exceptions.
        }
    }
}

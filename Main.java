package Laprak5;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    static void soal1() {
        int max = 0, min = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int x = in.nextInt();
            if (i == 1 || x > max) max = x;
            if (i == 1 || x < min) min = x;
        }
        System.out.println("Bilangan terbesar : " + max);
        System.out.println("Bilangan terkecil : " + min);
    }

    static void soal2() {
        System.out.print("Masukkan jumlah bilangan : ");
        int n = in.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            total += in.nextDouble();
        }
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + (n > 0 ? total / n : 0));
    }

    static void soal3() {
        System.out.print("Masukkan banyak baris : ");
        int n = in.nextInt();
        int angka = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", angka++);
            }
            System.out.println();
        }
    }

    static void soal4() {
        System.out.print("Masukkan banyak angka : ");
        int n = in.nextInt();
        int total = 0;
        int ganjil = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }

    static void soal5() {
        int n = 5;
        System.out.println("Half Triangle");
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int b = 0; b < 2 * i - 1; b++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("Full Triangle");
        for (int i = 1; i <= n; i++) {
            int bintang = (i <= (n + 1) / 2) ? 2 * i - 1 : 2 * (n - i + 1) - 1;
            int spasi = (n - bintang) / 2;
            for (int s = 0; s < spasi; s++) System.out.print(" ");
            for (int b = 0; b < bintang; b++) System.out.print("*");
            System.out.println();
        }
    }

    static void soal6() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i < 2) {                
                System.out.println(11);
            }
        }
    }

    static void soal7() {
        System.out.println("Menggunakan i++ (nilai dipakai dulu, baru ditambah)");
        int i = 0;
        while (i++ < 5) {
            System.out.println("i = " + i);   // output 1 2 3 4 5
        }

        System.out.println("\nMenggunakan ++i (ditambah dulu, baru nilai dipakai)");
        int j = 0;
        while (++j < 5) {
            System.out.println("j = " + j);   // output 1 2 3 4
        }
    }

    static void soal8() {
        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang"};
        for (String b : buah) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== Latihan Praktikum Perulangan ===");
            System.out.print("Pilih soal (1-8, 0 untuk keluar) : ");
            pilih = in.nextInt();
            System.out.println();
            switch (pilih) {
                case 1: soal1(); break;
                case 2: soal2(); break;
                case 3: soal3(); break;
                case 4: soal4(); break;
                case 5: soal5(); break;
                case 6: soal6(); break;
                case 7: soal7(); break;
                case 8: soal8(); break;
                case 0: System.out.println("Selesai."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}

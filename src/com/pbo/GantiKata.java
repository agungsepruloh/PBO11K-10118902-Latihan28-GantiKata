package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * Kelas : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini akan mengganti kata tertentu (sesuai input) dari sebuah kalimat
 *
 */

public class GantiKata {

    public static void main(String[] args) {
        System.out.println("===== Program Mengganti Kata =====");
        System.out.print("Masukkan Kalimat\t: ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata\t\t\t: ");
        String kataLama = scanner.next();
        System.out.print("Menjadi kata\t\t: ");
        String kataBaru = scanner.next();

        System.out.println("\n===== Hasil Formatting =====");
        System.out.println("Kalimat awal\t: ".concat(kalimat));
        System.out.println("Kalimat baru\t: ".concat(kalimat.replace(kataLama, kataBaru)));
    }
}

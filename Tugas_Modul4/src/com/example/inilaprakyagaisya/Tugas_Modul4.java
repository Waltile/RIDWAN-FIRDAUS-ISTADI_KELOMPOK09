/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inilaprakyagaisya;

import java.sql.SQLOutput;
import java.util.*;
import com.example.inilaprakyagaisya.feature;

public class Tugas_Modul4 {


    static void cetak1(){
        System.out.println("Kelompok 09 ");
        System.out.println("MUHAMMAD FARREL ASYRAF ABRAR (21120121140103) ");
        System.out.println("DIMAS FAJAR AWALUDIN (21120121120016) ");
        System.out.println("PIPIN DIEN LUXVIANA (21120121120025) ");
        System.out.println("RIDWAN FIRDAUS ISTADI (21120121130069) ");
    }

    static String cetak2(String text){
        return text;
    }


    public static void main(String[] args) {
        int input, jenisPinjaman, tahun;
        float hutang, angsuran, deposit, total = 0;
        Scanner myObj = new Scanner(System.in);
        String pilih,Tanya;
        Scanner sc = new Scanner(System.in);
        feature object = new feature();

        System.out.println(cetak2("░░░░▄▄▄▄▀▀▀▀▀▀▀▀▄▄▄▄▄▄"));
        System.out.println(cetak2("░░░░█░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░▀▀▄"));
        System.out.println(cetak2("░░░█░░░▒▒▒▒▒▒░░░░░░░░▒▒▒░░█"));
        System.out.println(cetak2("░░█░░░░░░▄██▀▄▄░░░░░▄▄▄░░░█"));
        System.out.println(cetak2("░▀▒▄▄▄▒░█▀▀▀▀▄▄█░░░██▄▄█░░░█"));
        System.out.println(cetak2("█▒█▒▄░▀▄▄▄▀░░░░░░░░█░░░▒▒▒▒▒█"));
        System.out.println(cetak2("█▒█░█▀▄▄░░░░░█▀░░░░▀▄░░▄▀▀▀▄▒█"));
        System.out.println(cetak2("░█▀▄░█▄░█▀▄▄░▀░▀▀░▄▄▀░░░░█░░█"));
        System.out.println(cetak2("░░░█░░██░░▀█▄▄▄█▄▄█▄████░█"));
        System.out.println(cetak2("░░░░█░░░▀▀▄░█░░░█░███████░█"));
        System.out.println(cetak2("░░░░░▀▄░░░▀▀▄▄▄█▄█▄█▄█▄▀░░█"));
        System.out.println(cetak2("░░░░░░░▀▄▄░▒▒▒▒░░░░░░░░░░█"));
        System.out.println(cetak2("░░░░░░░░░░▀▀▄▄░▒▒▒▒▒▒▒▒▒▒░█"));
        System.out.println(cetak2("░░░░░░░░░░░░░░▀▄▄▄▄▄░░░░░█"));
        System.out.println("");
        cetak1();

        object.identitasUser();

        object.judul();

        object.awalan();
        System.out.print("Masukkan angka untuk melanjutkan: ");

        while (true) {


            input = sc.nextInt();

            if (input == 1) {
                object.pinjaman();
                System.out.println("Masukkan Jumlah Pinjaman yang akan diajukan : ");
                jenisPinjaman = sc.nextInt();
                if (jenisPinjaman == 1){
                    System.out.println("Apakah Anda Yakin Dengan Pilihan Anda? (0 = tidak, 1 = iya)");
                    object.inputPertanyaan();


                }else if(jenisPinjaman == 2){
                    System.out.println("Apakah Anda Yakin Dengan Pilihan Anda? (0 = tidak, 1 = iya)");
                    object.inputPertanyaan();

                } else{
                    System.out.println("Apakah Anda Yakin Dengan Pilihan Anda? (0 = tidak, 1 = iya)");
                    object.inputPertanyaan();
                }
                    return;

            } else if (input == 2) {
                System.out.println("");
                System.out.println("========PROGRAM CEK SISA HUTANG========");
                System.out.println("!!Perlu diingat jangan gunakan titik saat memasukan angka!!");
                System.out.println("");
                System.out.print("Masukkan jumlah hutang anda: ");
                hutang = sc.nextFloat();
                System.out.print("Masukkan jumlah angsuran yang sudah dibayarkan: ");
                angsuran = sc.nextFloat();

                hutang = object.sisahutangSetelahAngsuran(hutang, angsuran);

                System.out.println("Sisa hutang anda sekarang " + hutang);
                if (hutang == 0){
                    System.out.println("HUTANG ANDA SUDAH LUNAS!!");

                    return;
                }

            } else if (input == 3) {
                System.out.println("=============================");
                System.out.println("KALKULATOR KEUNTUNGAN DEPOSIT");
                System.out.println("=============================");
                object.keuntunganDeposit();
                System.out.print("Masukkan jumlah deposit: ");
                deposit = sc.nextFloat();
                System.out.print("Masukkan lama tahun: ");
                tahun = sc.nextInt();

                System.out.println("Deposit setelah " + tahun + " tahun adalah: IDR " + object.kalkulasikeuntunganDeposit(deposit, tahun));

                return;
            }
        }
    }
}
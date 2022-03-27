/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inilaprakyagaisya;

import java.util.Scanner;

public class feature {
    public void judul(){
        System.out.println("");
        System.out.println("=======SELAMAT DATANG DI PROGRAM KOPERASI SIMPAN PINJAM=======");
        System.out.println("");
    }
    public void awalan(){
        System.out.println("ANGKA KUNCI:");
        System.out.println("1. Peminjaman");
        System.out.println("2. Setoran");
        System.out.println("3. Cek Deposit");
    }
    public void pinjaman() {

        System.out.println("========Jenis Pinjaman=========");
        System.out.println("1. IDR 2 Juta");
        System.out.println("2. IDR 4 Juta");
        System.out.println("3. IDR 8 Juta");

    }

    public void keuntunganDeposit() {

        System.out.println("Keuntungan deposit per tahun = 2.5%");

    }

    public void inputPertanyaan() {
        String Tanya;
        Scanner myObj = new Scanner(System.in);

        Tanya  = myObj.nextLine();
        if(Tanya.equals("0")){
            System.out.println("Proses dibatalkan");
        } else if (Tanya.equals("1")){
            System.out.println("Permintaan akan segera diproses");
        }
    }

    public void identitasUser() {
        String Nama,Email;
        int Umur,Nomor_HP;
        Scanner Identitas = new Scanner(System.in);

        System.out.println("");
        System.out.println("Nama: ");
        Nama = Identitas.nextLine();
        System.out.println("Email: ");
        Email = Identitas.nextLine();
        System.out.println("Umur: ");
        Umur = Identitas.nextInt();
        System.out.println("Nomor HP: ");
        Nomor_HP = Identitas.nextInt();

        System.out.println("============");
        System.out.println("Nama: " + Nama);
        System.out.println("Umur: " + Umur);
        System.out.println("Email: "+ Email);
        System.out.println("Nomor HP: "+ Nomor_HP);
    }

    public float kalkulasikeuntunganDeposit(float deposit, int tahun) {

        final float persentaseKeuntungan = 1.025f;
        float pengaliKeuntungantotal = 1;
        float keuntunganTotal;

        for (int i = 1; i <= tahun; i++) {

            pengaliKeuntungantotal *= persentaseKeuntungan;


        }

        keuntunganTotal = deposit * pengaliKeuntungantotal;

        return keuntunganTotal;
    }

    public float deposit(float Deposit) {
        float hasilAkhir = 0;
        hasilAkhir += Deposit;

        return hasilAkhir;

    }


    public float sisahutangSetelahAngsuran(float hutang, float angsuran) {

        hutang = hutang - angsuran;

        return hutang;
    }
}
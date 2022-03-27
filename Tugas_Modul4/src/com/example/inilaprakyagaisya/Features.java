/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inilaprakyagaisya;

public class Features {

    public void pinjaman() {

        System.out.println("========Jenis Pinjaman=========");
        System.out.println("1. IDR 2 Juta");
        System.out.println("2. IDR 4 Juta");
        System.out.println("3. IDR 8 Juta");

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

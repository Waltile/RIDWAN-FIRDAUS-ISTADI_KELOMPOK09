/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inilaprakyagaisya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int input, jenisPinjaman;
    float hutang, angsuran, deposit, total = 0;
    Scanner sc = new Scanner(System.in);
    Features object = new Features();


        while (true) {

            System.out.print("Enter something to call the function: ");

            input = sc.nextInt();

            if (input == 1) {
                object.pinjaman();
            } else if (input == 2) {
                System.out.print("Masukkan hutang: ");
                hutang = sc.nextFloat();
                System.out.println("Masukkan banyak angsuran");
                angsuran = sc.nextFloat();

                hutang = object.sisahutangSetelahAngsuran(hutang, angsuran);

                System.out.println("Sisa hutang anda sekarang " + hutang);

            } else if (input == 3) {

                System.out.print("Masukkan jumlah deposit: ");
                deposit = sc.nextFloat();

                total += object.deposit(deposit);

                System.out.println(total);

            }
            else {
                System.exit(0);
            }

        }
    }
}

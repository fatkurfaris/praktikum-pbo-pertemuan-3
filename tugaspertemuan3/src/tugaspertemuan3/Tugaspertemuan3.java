/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;

import java.util.Scanner;

public class Tugaspertemuan3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String masuk = "ya";
        String gun = "gunner";
        String knive = "kniver";
        String sword = "swordmaster";
        Player faris = new Player ("fatkurfaris","1234567890");
        Gun Gun1 = new Gun(25,"2x","Maverick",150);
        Knive Knive1 = new Knive ("Brazilian Knive",25);
        Sword Sword1 = new Sword ("Katana",65);
        Weapon Gun2 = new Gun(25,"2x","Hyper Maverick",200);
        Weapon Knive2 = new Knive ("Hyper Brazilian Knive",40);
        Weapon Sword2 = new Sword ("Hyper Katana",80);
        
        try { // try disini untuk exception pada baris ke 38, ketika yang diinputkan bukan sebuah bilangan 
              // maka akan langsung menuju sebuah method catch pada baris ke 111 
        System.out.println("apakah anda ingin memilih senjata? ya/tidak");
        String pilih = input.nextLine();
        if (pilih.equals(masuk)){  
            System.out.print("1.");Gun1.Spesification();
            System.out.println("--------------------");
            System.out.print("2.");Knive1.Spesification();
            System.out.println("--------------------");
            System.out.print("3.");Sword1.Spesification();
            System.out.println("--------------------");
            System.out.println("pilih salah satu untuk memulai permainan");
            int number = input.nextInt();
            switch (number){
                case 1:
                    System.out.println("anda membutuhkan username dan password untuk mengakses senjata ini");
                    System.out.println("silahkan masukkan username dan password");
                    String username,password;
                    System.out.print("username : "); 
                    username = input.next();
                    System.out.print("password : "); 
                    password = input.next(); 
                    if(faris.login (username,password)){
                        System.out.println("anda telah berhasil login dan bisa menggunakan senjata ini"); 
                        System.out.println("apakah anda ingin menaikkan attackpoint dari senjata ini?ya/tidak");
                        String pilih2 = input.next();
                        if (pilih2.equals(masuk)){
                            System.out.println("masukkan sandi yang anda dapatkan di perjalanan");
                            String sandi1 = input.next();
                            if (sandi1.equals(gun)) {
                                System.out.println("selamat Attack Point senjata anda dari "+Gun1.AttackPoint+" menjadi "+ Gun2.AttackPoint);
                                System.out.println("jadi total Attack Point senjata anda dari "+Gun1.AttackPoint*Gun1.Amunition+" menjadi "+ Gun2.AttackPoint* Gun1.Amunition);
                            }else{
                                System.out.println("sandi tidak berhasil dimasukkan");
                            }
                        }else{
                            System.out.println("baik selamat menikmati permainan :) ");
                        }
                    }else{ 
                        System.out.println("gagal login");
                    }
                    break;
                    
                case 2:
                    System.out.println("anda bisa menggunakan " + Knive1.Name);
                    System.out.println("apakah anda ingin menaikkan attackpoint dari senjata ini?ya/tidak");
                        String pilih2 = input.next();
                        if (pilih2.equals(masuk)){
                            System.out.println("masukkan sandi yang anda dapatkan di perjalanan");
                            String sandi2 = input.next();
                            if (sandi2.equals(knive)) {
                                System.out.println("selamat Attack Point senjata anda dari "+Knive1.AttackPoint+" menjadi "+ Knive2.AttackPoint);
                                System.out.println("jadi total Attack Point senjata anda dari "+Knive1.AttackPoint+" menjadi "+ Knive2.AttackPoint);
                            }else{
                                System.out.println("sandi tidak berhasil dimasukkan");
                            }
                        }else{
                            System.out.println("Baik silahkan menikmati permainan");
                        }
                    break;
                    
                case 3:
                    System.out.println("Anda bisa menggunakan " + Sword1.Name);
                    System.out.println("apakah anda ingin menaikkan attackpoint dari senjata ini?ya/tidak");
                        String pilih3 = input.next();
                        if (pilih3.equals(masuk)){
                            System.out.println("masukkan sandi yang anda dapatkan di perjalanan");
                            String sandi3 = input.next();
                            if (sandi3.equals(sword)) {
                                System.out.println("selamat Attack Point senjata anda dari "+ Sword1.AttackPoint +"  menjadi "+ Sword2.AttackPoint);
                                System.out.println("jadi total Attack Point anda dari "+Sword1.AttackPoint+" menjadi "+ Sword2.AttackPoint);
                        }else{
                            System.out.println("baik selamat menikmati permainan :) ");
                        }
                    break;
                    } else{
                            System.out.println("Baik silahkan menikmati permainan");
                        }
                }
            }else{
            System.out.println("terima kasih telah berniat memjalankan program ini");
            }
        }
        catch (Exception error){ // catch disini berfungsi untuk memunculkan perintah ketika yang diinputkan berupa huruf
            System.out.println("anda harus memasukkan angka untuk pilihan ini " + error.getMessage());
        }
    }
}
    

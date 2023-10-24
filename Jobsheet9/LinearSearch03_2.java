package Jobsheet9;

import java.util.Scanner;

public class LinearSearch03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++){
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        for (int i = 0; i < jumlah; i++){
            if (arrayInt[i] == key){
                hasil = i;                
                System.out.println("Key ada dalam array pada posisi indeks ke-"+ hasil);
                break;
            }else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}

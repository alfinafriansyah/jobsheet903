package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;
        int countLulus = 0, countTidakLulus = 0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        for (int i = 0; i < jmlMhs; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i= 0; i < jmlMhs; i++){
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                countLulus++;
            }else{
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }
        rata2Lulus = totalLulus/countLulus;
        rata2TidakLulus = totalTidakLulus/countTidakLulus;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TidakLulus);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan40warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini dapat melihat kepribadian seseorang dari warna
 */
public class IF110118015Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaMu;
        String namaMu;
        Warna warni = new Warna();
        Scanner input = new Scanner(System.in);

        System.out.print(warni.ANSI_RED + "YUK "+ warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN + "CEK "+ warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW + "KEPRIBADIANMU "+ warni.ANSI_RESET);
        System.out.print(warni.ANSI_CYAN + "DARI "+ warni.ANSI_RESET);
        System.out.print(warni.ANSI_PURPLE + "WARNA "+ warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE + "FAVORITMU "+ warni.ANSI_RESET + "\n");

        System.out.print("\n" + warni.ANSI_RED_BACKGROUND + warni.ANSI_WHITE+ "\t MERAH \t\t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN_BACKGROUND + warni.ANSI_WHITE+ "\t HIJAU \t\t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW_BACKGROUND + warni.ANSI_WHITE+ "\t KUNING \t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE_BACKGROUND + warni.ANSI_WHITE+ "\t BIRU \t\t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_PURPLE_BACKGROUND + warni.ANSI_WHITE+ "\t UNGU \t\t\n\n" + warni.ANSI_RESET);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaMu = input.next();
        System.out.print("NAMA KAMU : ");
        namaMu = input.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase() + "====");
        warni.hasilwarna(warnaMu);
    }
    
}

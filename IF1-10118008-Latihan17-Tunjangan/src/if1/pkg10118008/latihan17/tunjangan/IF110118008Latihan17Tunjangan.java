/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan17.tunjangan;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: Menghitung gaji total berdasarkan gaji pokok dan status kawin
 */
public class IF110118008Latihan17Tunjangan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("============== Program Tunjangan ==================");
		System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
		Scanner scanner = new Scanner(System.in);
		double gaji = scanner.nextInt();
		double tunjangan = 0;
		System.out.print("Status anda? (Menikah/Belum)\t\t: ");
		String status = scanner.next();
		if (status.equals("Menikah")) {
			tunjangan = 0.35 * gaji;	
			System.out.println(status);
		}
		double totalGaji = gaji + tunjangan;
		System.out.println("========Hasil Perhitungan Gaji Anda=============");
		System.out.println("Gaji Pokok\t\t: Rp. "+ gaji);
		System.out.println("Tunjangan\t\t: Rp. "+ tunjangan);
		System.out.println("Total Gaji\t\t: Rp. "+ totalGaji);
	}
	
}

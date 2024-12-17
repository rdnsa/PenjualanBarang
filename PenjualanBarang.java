import java.util.Scanner;

public class PenjualanBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PT. PERMATA \"PRATAMA\"");
        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");

        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();

        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();

        System.out.print("Jumlah Data yang akan dimasukkan: ");
        int jumlahData = input.nextInt();
        String[] kodeBarang = new String[jumlahData];
        int[] jumlahBarang = new int[jumlahData];
        String[] namaBarang = new String[jumlahData];
        int[] hargaBarang = new int[jumlahData];
        int[] totalHarga = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Data Ke-" + (i+1) + " Kode Barang: ");
            kodeBarang[i] = input.next();
            input.nextLine();

            switch(kodeBarang[i]) {
                case "P001":
                    namaBarang[i] = "Printer";
                    hargaBarang[i] = 700000;
                    break;
                case "V001":
                    namaBarang[i] = "VGA Card";
                    hargaBarang[i] = 75000;
                    break;
                case "M001":
                    namaBarang[i] = "Motherboard";
                    hargaBarang[i] = 950000;
                    break;
                default:
                    System.out.println("Kode Barang tidak valid!");
                    return;
            }

            System.out.print("Jumlah: ");
            jumlahBarang[i] = input.nextInt();

            totalHarga[i] = hargaBarang[i] * jumlahBarang[i];
        }

        System.out.println("\nPT. PERMATA \"PRATAMA\"");
        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
                System.out.println("Nama Petugas: " + namaPetugas + " Tanggal: " + tanggal);
        System.out.println("Jumlah Data yang dimasukkan: " + jumlahData);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.printf("%-6s%-12s%-12s%-12s%-12s%-12s\n", "Data", "Kode Barang", "Nama Barang", "Harga", "Jumlah", "Total");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        int totalPendapatan = 0;

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-6d%-12s%-12s%-12d%-12d%-12d\n", (i+1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBarang[i], totalHarga[i]);
            totalPendapatan += totalHarga[i];
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                System.out.printf("Total Pendapatan pada tanggal %s adalah sebesar Rp. %d\n", tanggal, totalPendapatan);

        input.close();
    }
}

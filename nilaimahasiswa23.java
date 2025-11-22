import java.util.Scanner;
public class nilaimahasiswa23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();

    int[] nilai = new int[n];
    int total = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE; 
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        double rataRata = (double) total / n;
    System.out.println("\n--- Hasil ---");
    System.out.println("Nilai rata-rata: " + rataRata);
    System.out.println("Nilai tertinggi: " + max);
    System.out.println("Nilai terendah: " + min);
    System.out.println("Semua nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
}

    


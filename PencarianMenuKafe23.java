import java.util.Scanner;

public class PencarianMenuKafe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
    System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
        System.out.println((i + 1) + ". " + menu[i]);
        }
    System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String pencarian = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(pencarian)) {
                System.out.println("Makanan \"" + pencarian + "\" tersedia di menu.");
                ditemukan = true;
                break;
            }
        }

    if (!ditemukan) {
            System.out.println("Maaf, makanan \"" + pencarian + "\" tidak ada di menu.");
        }
    }
}

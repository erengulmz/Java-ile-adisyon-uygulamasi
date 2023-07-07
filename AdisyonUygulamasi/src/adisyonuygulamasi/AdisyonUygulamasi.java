package adisyonuygulamasi;
import java.util.Scanner;
public class AdisyonUygulamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = {5.50, 6.50, 3.00, 2.00, 1.85};
        String[] products = {"Döner", "Kumpir", "Pide", "Salata", "Mesrubat"};
        int[] order = new int[5];

        String choice;
        do {
            System.out.println("Ürün Fiyat");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " " + prices[i]);
            }
            System.out.print("Yeni siparis için (y), Adisyon olusturmak için (q): ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Ürün Numarasi: ");
                int productIndex = Integer.parseInt(scanner.nextLine()) - 1;
                System.out.println("Adet: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                order[productIndex] += quantity;
            }
        } while (!choice.equalsIgnoreCase("q"));

        double total = 0.0;
        System.out.println("..ADISYONUNUZ TAMAMLANDI..");
        for (int i = 0; i < order.length; i++) {
            if (order[i] > 0) {
                System.out.println(order[i] + " adet " + products[i]);
                total += order[i] * prices[i];
            }
        }
        System.out.println("Toplam: " + total + " TL");
    }
    }
    
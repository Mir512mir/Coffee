import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wwedite nomer napitka:");
        int drink = scanner.nextInt();
        scanner.close();

        switch (drink) {
            case 1:
                System.out.println("Espresso");
                break;


            case 2:
                System.out.println("Prigotowlenije espresso");
                System.out.println("Dobawlenije wody");
                System.out.println("Americano gotow");
                break;

            case 3:
                System.out.println("Prigotowlenije espresso");
                System.out.println("Dobawlenije wspennennogo moloka");
                System.out.println("Capucchino gotow");
                break;
            case 4:
                System.out.println("wybor paketika");
                System.out.println("Dobawlenije wody");
                System.out.println("Tee gotow");
                break;


            default:
                System.out.println("Error");
        }
    }
}
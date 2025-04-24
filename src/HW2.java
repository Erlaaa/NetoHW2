import ru.netology.service.CustomsService;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.next();
        System.out.println("Здравствуйте, " + name);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int fee = CustomsService.calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составляет: " + fee);
    }

}

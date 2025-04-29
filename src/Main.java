import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int days;
        while (true) {
            score ++;
            System.out.println("Введите год в формате yyyy");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней");
            int inputDays = scanner.nextInt();

            if(year % 400 == 0) {
                days = 366;
            } else if(year % 4 == 0 && year % 100 != 0) {
                days = 366;
            } else {
                days = 365;
            } // я хотел проверку вынести в отдельный пакет, но чёт не понял, как вызвать проверку в основном классе
            // был бы рад, если бы в проверке дз написали, как это сделать

            if(inputDays == days) {
                continue;
            } else {
                System.out.println("Неправильно! В этом году " + days + " дней!");
                break;
            }
        }
        System.out.println(score);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите Вашу OC установленную на телефоне (0 - iOS, 1 - Android): ");
        byte clientOS = in.nextByte(); // 0 - IOS, 1 - Android;

        if (clientOS == 1) {
            System.out.println("Установите версию нашего приложения для 'Android' по ссылке...");
        } else if (clientOS == 0) {
            System.out.println("Установите версию нашего приложения для 'iOS' по ссылке...");
        } else System.out.println("Операционная система не опознана");
        System.out.println("========================================================");


        // Задание 2
        System.out.println("Задание 2");
        System.out.print("Укажите год рождения Вашего телефона: ");
        short clientDeviceYear = in.nextShort();  // переменная clientDeviceYear это год выпуска телефона
        System.out.print("Укажите Вашу операционную систему установленную на телефоне (0 - iOS, 1 - Android): ");
        byte telephoneOS = in.nextByte();          // 0 - IOS, 1 - Android;

        if (telephoneOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для 'iOS' по ссылке");
        } else if (telephoneOS == 0 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Установите новую версию нашего приложения для 'iOS' по ссылке");
        }
        if (telephoneOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для 'Android' по ссылке");
        } else if (telephoneOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Установите новую версию нашего приложения для 'Android' по ссылке");
        } else {
            System.out.println("Ничем помочь не сможем или при вводе данных допущена ошибка.");

            System.out.println("=======================================================================");


            // Задание 3
            System.out.println("Задание 3");
            short Year = in.nextShort();
            System.out.print("Укажите интересующий Вас год: ");

            if ((Year % 4) == 0 && (Year % 100) != 0) {
                System.out.println(Year + " високосный год.");
            } else {
                System.out.println(Year + " не является високосным.");
                System.out.println("============================================================");


                // Задание 4
                System.out.println("Задание 4");


                System.out.print("Укажите расстояние (+ - км) от нашего офиса до адреса доставки: ");
                short deliveryDistance = in.nextShort();
                byte Dostavki = 0;

                if (deliveryDistance < 20) {
                    Dostavki = 1;
                } else
                if (deliveryDistance >= 20 && deliveryDistance < 60) {
                    Dostavki = 2;
                } else
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    Dostavki = 3;
                }
                if (deliveryDistance > 100) {
                    System.out.println("Условия доставки оговариваются отдельно. Мы с Вами свяжемся...");
                } else
                    System.out.println("Потребуется " + Dostavki + " деней(я)");
                System.out.println("============================================");

                // Задание 5
                System.out.println("Задание 5");

                System.out.print("Введите номер интересующего Вас месяца: ");
                byte monthNumber = in.nextByte();

                switch (monthNumber) {
                    case 1:
                    case  2:
                        System.out.println("Зимний месяц.");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весенний месяц.");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Летний месяц.");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осенний месяц");
                        break;
                    case 12:
                        System.out.println("Зимний месяц.");
                        break;
                    default:
                        System.out.println("ОШИБКА");
                }
                System.out.println("=========================================");



            }

        }
    }
}


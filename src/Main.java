public class Main {

    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.printf(" Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.printf(" Установите версию приложения для Android по ссылке");
        }
        // задание 2
        int clientOSe = 0;
        int age = 2010;
        if (clientOSe == 0 && age >= 2015) {
            System.out.printf(" Установите версию приложения для iOS по ссылке");
        } else if (clientOSe == 1 && age >= 2015) {
            System.out.printf(" Установите версию приложения для Android по ссылке");
        } else if (age < 2015)
            System.out.printf(" К сожалению ваш телефон не подходит");
        // Задание 3
        int year = 2024;
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println(" Этот год высокосный");
        } else {
            System.out.println(" Год не является высокосным");
        }
        // задание 4
        int deliveryDistance = 21;
        if (deliveryDistance <= 20) {
            System.out.printf(" Доставка в пределах 20 км занимает сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println(" Доставка занимает двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println(" Доставка занимает 3-е суток");
        }
        // Задание 5
        int monthNumber = 12;
        if (monthNumber >= 2 && monthNumber == 12) {
            System.out.println(" Это Зима");
        } else if (monthNumber == 3 && monthNumber == 4 && monthNumber == 5) {
            System.out.println("Это Весна");
        } else if (monthNumber == 6 && monthNumber == 7 && monthNumber 8) {
            System.out.println("Это Лето");
        } else if (monthNumber == 9 && monthNumber == 10 && monthNumber == 11) {
            System.out.println("Это осень");
        }
    }
}
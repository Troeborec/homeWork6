public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию для приложения Android по ссылке");
        }
        //task2
        System.out.println("Задача №2");
        int clientOS1 = 0;
        int clientDeviceyear = 2016;
        if (clientOS1 == 0 && clientDeviceyear < 2015) {
            System.out.println("Установить облегченную версию приложения для IOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceyear < 2015) {
            System.out.println("Установить облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 0 && clientDeviceyear > 2015) {
            System.out.println("Установите приложение для IOS");
        } else {
            System.out.println("Установите приложение для Android");
        }
        //task3
        System.out.println("Задача №3");
        int year = 400;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //task4
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

        //task 5
        System.out.println("Задача №5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца больше 12");


        }
    }
}
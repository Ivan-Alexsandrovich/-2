public class Main {
    public static void main(String[] args) {
        System.out.println();
        {
            int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        System.out.println();
        {

            int clientOS = 0;
            int clientDeviceYear = 2014;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке».");
            } else if (clientOS == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }


        }
        System.out.println();
        {
            int year = 2024;
            if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("високосный");
            } else {
                System.out.println("не является високосным");

            }
        }
        System.out.println();
        {
            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance > 100) {
                System.out.println("доставки нет");
            } else {
                if (deliveryDistance > 20)
                    days++;
            }
            {
                if (deliveryDistance > 60)
                    days++;
            }
            System.out.println("Потребуется дней "+ days +" срок доставки.");



        }
        System.out.println();;
        {
            int month =12 ;
            switch (month) {
                case 12, 1, 2:
                    System.out.println("зима");
                    break;
                case 3, 4, 5:
                    System.out.println("весна");
                    break;
                case 6, 7, 8:
                    System.out.println("лето");
                    break;
                case 9, 10, 11:
                    System.out.println("осень");
                    break;

            }

        }

    }
}




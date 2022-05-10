import java.time.LocalDate;
public class Main {
    public static void  printSeparator() {
        System.out.println("=================================================================");
    }
 //Zadanie1
    public static boolean checkLeapYear (int year){
        return year %4 == 0;
    }
    public static void printLeapYearResult (int year, boolean leapYear){
        if (leapYear){
            System.out.println(year + " високосный год");
        } else{
            System.out.println(year + " не високосный год");
        }
    }
    public static void printLeapYear(int year){
        boolean leapYear = checkLeapYear(year);
        printLeapYearResult(year, leapYear);
    }

    //Zadanie2

    public static int discoverOS(String name){
        if (name.equals("IOS")){
            return 0;
        } else {
            return 1;
        }
    }
    public static void printMassageDevice(int year, String operSist){
        int currentYear = LocalDate.now().getYear();
        if (currentYear == year){
            System.out.println("Установите версию приложения для " + operSist);
        } else if (currentYear > year){
            System.out.println("Установите Lite-версию приложения для " + operSist);
        } else{
            throw new RuntimeException("НЕВЕРНО ВВЕДЕН ГОД. ОН ЕЩЕ НЕ НАСТУПИЛ!");
        }
    }
    public static String printOS(String operSist) {
        if (discoverOS(operSist) == 0) {
            return "IOS по ссылке";
        } else {
            return "Android по ссылке";
        }
    }
    public static void printMassage (int year, String operSist){
          operSist = printOS(operSist);
          printMassageDevice(year, operSist);
    }

    //Zadanie3
    public static int chekDistance (int distanse){
        if (distanse < 60 && distanse >= 20){
            return 2;
        } else if (distanse < 20){
            return 1;
        } else if (distanse > 100){
            throw new RuntimeException("Доставка невозможна! Обратитесь в ближайшее отделение банка!");
        } else {
            return 3;
        }
    }
    public static void printMassageDelivery(int distance){
        int day = chekDistance(distance);
        System.out.println("Потребуется дней: " + day);
    }
    public static void main(String[] args) {
        //Z1
        int visokosniiYear = 2021;
        printLeapYear(visokosniiYear);

            printSeparator();
        //Z2
        String operSist = "IOS";
        int yearDevice = 2022;
        printMassage(yearDevice, operSist);

            printSeparator();
        //Z3
        int distance = 20;
        printMassageDelivery(distance);
    }

}
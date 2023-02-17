public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte varByte = 3;
        short varShort = 30000;
        int varInt = 2000000000;
        long varLong = 200000000000000000L;
        float varFloat = 2.222F;
        double varDouble = 22.222;
        System.out.println("Значение переменной varByte" + " с типом byte" + " равно " + varByte );
        System.out.println("Значение переменной varShort" + " с типом short" + " равно " + varShort);
        System.out.println("Значение переменной varInt" + " с типом int" + " равно " + varInt);
        System.out.println("Значение переменной varLong" + " с типом long" + " равно " + varLong);
        System.out.println("Значение переменной varFloat" + " с типом float" + " равно " + varFloat);
        System.out.println("Значение переменной varDouble" + " с типом double" + " равно " + varDouble);
        // не выводил значение переменных в консоль, т.к. по условиям задачи этого не требуется



    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte varByte = 67;
        short varShort = -159;
        int varInt = 569;
        long varLong = 987678965549L;
        float varFloat = 27.12F;
        double varDouble = 2.786;
        // не выводил значение переменных в консоль, т.к. по условиям задачи этого не требуется
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int teacherLyudmilaStudents = 23;
        int teacherAnnaStudents = 27;
        int teacherEkaterinaStudents = 30;
        int paperSheetsTotal = 480;
        int studentsTotal = teacherLyudmilaStudents + teacherAnnaStudents + teacherEkaterinaStudents;
        int sheetsPerStudent = paperSheetsTotal / studentsTotal;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int bottlePerTwoMinutes = 16;
        int bottlePerMinute = bottlePerTwoMinutes / 2;
        int bottlePerTwentyMinutes = bottlePerMinute * 20;
        int bottlePerDay = bottlePerMinute * 60 * 24;
        int bottlePerThreeDays = bottlePerDay * 3;
        int bottlePerMonth = bottlePerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlePerTwentyMinutes + " штук бутылок" );
        System.out.println("За сутки машина произвела " + bottlePerDay + " штук бутылок" );
        System.out.println("За 3 дня машина произвела " + bottlePerThreeDays + " штук бутылок" );
        System.out.println("За 1 месяц машина произвела " + bottlePerMonth + " штук бутылок" );
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int cansTotal = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int classesTotal = cansTotal / cansPerClass;
        int whiteCansTotal = whiteCansPerClass * classesTotal;
        int brownCansTotal = brownCansPerClass * classesTotal;
        System.out.println("В школе, где " + classesTotal + " классов, нужно " + whiteCansTotal + " банок белой краски, и "
                + brownCansTotal + " банок коричневой краски" );
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int bananaWeight = 80;
        int bananasTotal = 5;
        int bananasWeightTotal = bananaWeight * bananasTotal;
        int milkTotalMl  = 200;
        int milkWeightPerHundredMl = (milkTotalMl / 200) * 105;
        int milkWeightTotal = milkWeightPerHundredMl * 2;
        int iceCreamWeight = 100;
        int iceCreamWeightTotal = iceCreamWeight * 2;
        int eggWeight = 70;
        int eggsTotal = 4;
        int eggWeightTotal = eggWeight * eggsTotal;
        int grPerKg = 1000;
        int breakfastWeightTotalGr = eggWeightTotal + iceCreamWeightTotal + milkWeightTotal + bananasWeightTotal;
        float breakfastWeightTotalKilo = breakfastWeightTotalGr / (float)grPerKg;
        System.out.println("Вес спортзавтрака в граммах - " + breakfastWeightTotalGr + " гр");
        System.out.println("Вес спортзавтрака в килограммах - " + breakfastWeightTotalKilo + " кг");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        int extraWeightKg = 7;
        int extraWeightGr = extraWeightKg * 1000;
        int dailyLossMin = 250;
        int dailyLossMax = 500;
        int daysForSlowLoss = extraWeightGr / dailyLossMin;
        int daysForFastLoss = extraWeightGr / dailyLossMax;
        int daysForAverageLoss = (daysForFastLoss + daysForSlowLoss) / 2;
        System.out.println("При потере 250 грамм в сутки на похудение уйдёт " + daysForSlowLoss + " дней");
        System.out.println("При потере 500 грамм в сутки на похудение уйдёт " + daysForFastLoss + " дней");
        System.out.println("В среднем на похудение уйдёт " + daysForAverageLoss + " день");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        double salaryMashaAfterRaise = salaryMasha + (salaryMasha / 10);
        double salaryMashaDiffMonthly = salaryMashaAfterRaise - salaryMasha;
        double salaryMashaDiffAnnualy = salaryMashaDiffMonthly * 12;

        double salaryDenisAfterRaise = salaryDenis + (salaryDenis / 10);
        double salaryDenisDiffMonthly = salaryDenisAfterRaise - salaryDenis;
        double salaryDenisDiffAnnually = salaryDenisDiffMonthly * 12;

        double salaryKristinaAfterRaise = salaryKristina + (salaryKristina / 10);
        double salaryKristinaDiffMonthly = salaryKristinaAfterRaise - salaryKristina;
        double salaryKristinaDiffAnnually = salaryKristinaDiffMonthly * 12;

        System.out.println("Маша теперь получает " + salaryMashaAfterRaise + " рублей. Годовой доход вырос на " + salaryMashaDiffAnnualy + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfterRaise + " рублей. Годовой доход вырос на " + salaryDenisDiffAnnually + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaAfterRaise + " рублей. Годовой доход вырос на " + salaryKristinaDiffAnnually + " рублей");



    }
}
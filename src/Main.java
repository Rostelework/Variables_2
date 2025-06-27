import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Task1");
        byte b1 = 10;
        short s1 = 200;
        int i1 = 3000;
        long l1 = 40000L;
        float f1 = 50.1234567f;
        double d1 = 600.123456789;
        System.out.println("Значение переменной b1 c типом byte равно: " + b1);
        System.out.println("Значение переменной s1 c типом short равно: " + s1);
        System.out.println("Значение переменной i1 c типом int равно: " + i1);
        System.out.println("Значение переменной l1 c типом long равно: " + l1);
        System.out.println("Значение переменной f1 c типом float равно: " + f1);
        System.out.println("Значение переменной d1 c типом double равно: " + d1);

        System.out.println(" ");
        System.out.println("Task2");
        float f2 = 27.12f;
        long l2 = 987_678_965_549L;                                               // привел в соответствие
        float f3 = 2.786f;
        short s2 = 569;
        short s3 = -159;
        short s4 = 27897;
        byte b2 = 67;
        System.out.println("Значение переменной f2 c типом float равно: " + f2);
        System.out.println("Значение переменной l2 c типом long равно: " + l2);    // привел в соответствие
        System.out.println("Значение переменной f3 c типом float равно: " + f3);
        System.out.println("Значение переменной s2 c типом short равно: " + s2);
        System.out.println("Значение переменной s3 c типом short равно: " + s3);
        System.out.println("Значение переменной s4 c типом short равно: " + s4);
        System.out.println("Значение переменной b2 c типом byte равно: " + b2);

        System.out.println(" ");
        System.out.println("Task3");
        byte numberOfStudents1 = 23;
        byte numberOfStudents2 = 27;
        byte numberOfStudents3 = 30;
        short countOfPapers = 480;
        int  paperPerPerson = countOfPapers / (numberOfStudents1 + numberOfStudents2 + numberOfStudents3);
        System.out.println("На каждого ученика расчитано " + paperPerPerson + " листов бумаги.");

        System.out.println(" ");
        System.out.println("Task4");
        byte machinePerformanceForOneMinute = 16 / 2;
        int productivityForTwentyMinutes = machinePerformanceForOneMinute * 20;
        int productivityForOneDay = machinePerformanceForOneMinute * 60 * 24;
        int productivityForThreeDays = productivityForOneDay * 3;
        int productivityForOneMonth = productivityForOneDay * 30;
        System.out.println("За 20 минут машина произвела " + productivityForTwentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + productivityForOneDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + productivityForThreeDays + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + productivityForOneMonth + " штук бутылок.");

        System.out.println(" ");
        System.out.println("Task5");
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteColourCans = totalClasses * whiteCansPerClass;
        int totalBrownColourCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteColourCans + " банок белой краски и " + totalBrownColourCans + " банок коричневой краски.");

        System.out.println(" ");
        System.out.println("Task6");
        int weightOfOneBananaInGrams = 80;
        int countOfBananasForReceipt = 5;
        int totalOfBananas = weightOfOneBananaInGrams * countOfBananasForReceipt;
        int weightOf100MillilitersInGrams = 105;
        int amountOfMilkInMillilitersForReceipt = 200;
        int totalOfMilk = (amountOfMilkInMillilitersForReceipt / 100) * weightOf100MillilitersInGrams;
        int weightOfOneIceCreamInGrams = 100;
        int countOfIceCreamForReceipt = 2;
        int totalOfIceCream= weightOfOneIceCreamInGrams * countOfIceCreamForReceipt;
        int weightOfOneEggInGrams = 70;
        int countOfEggsForReceipt = 4;
        int totalOfEggs = weightOfOneEggInGrams * countOfEggsForReceipt;
        int weightOfBreakfastInGrams = totalOfBananas + totalOfMilk + totalOfIceCream + totalOfEggs;
        float weightOfBreakfastInKilograms = weightOfBreakfastInGrams * 0.001f;
        System.out.println("Вес завтрака в граммах: " + weightOfBreakfastInGrams);
        System.out.println("Вес завтрака в килограммах: " + weightOfBreakfastInKilograms);

        System.out.println(" ");
        System.out.println("Task7");
        int targetToLoseWeight = 7;
        float losingKilogramsEveryDayInCase1 = 250 * 0.001f;
        float losingKilogramsEveryDayInCase2 = 500 * 0.001f;
        float daysInCase1 = targetToLoseWeight / losingKilogramsEveryDayInCase1;
        float daysInCase2 = targetToLoseWeight / losingKilogramsEveryDayInCase2;
        float averageOfDays = targetToLoseWeight / ((losingKilogramsEveryDayInCase1 + losingKilogramsEveryDayInCase2) / 2);
        System.out.println(daysInCase1 + " дней потребуется при похудении на 250 грамм."); //Выводит в консоль сроку вида: "28.0 дней потребуется при похудении на 250 грамм."
        System.out.println(daysInCase2 + " дней потребуется при похудении на 500 грамм."); //Выводит в консоль сроку вида: "14.0 дней потребуется при похудении на 250 грамм."

        //Нашел какой-то способ по избавлению нулей после запятой в днях: (Кроме этого, есть еще более простой и изящный способ по отбрасыванию нулей после запятой?)
        DecimalFormat df = new DecimalFormat("#.#####");
        String formattedNumber1 = df.format(daysInCase1);
        System.out.println(formattedNumber1 + " дней потребуется при похудении на 250 грамм."); //Выводит в консоль строку вида: "28 дней потребуется при похудении на 250 грамм."
        String formattedNumber2 = df.format(daysInCase2);
        System.out.println(formattedNumber2 + " дней потребуется при похудении на 250 грамм."); //Выводит в консоль строку вида: "14 дней потребуется при похудении на 250 грамм."

        System.out.println(averageOfDays + " дней потребуется в среднем."); //Выводит в консоль сроку вида: "18.666666 дней потребуется в среднем."
        //Выведем это же значение в более удобный вид:
        int wholePartOfDays = (int) Math.floor(averageOfDays); // Округляю здесь дни в меньшую сторону до целого числа, чтобы выделить полное число дней
        float decimalHours = (averageOfDays - wholePartOfDays) * 24; // Нахожу остаток часов в десятичном выражении и умножаю на 24 (т.к. 1 ч = 24 ч)
        int wholePartOfHours = (int) Math.floor(decimalHours); // Округляю здесь часы в меньшую сторону до целого числа, чтобы выделить полное количество часов
        float decimalMinutes = (decimalHours - wholePartOfHours) * 60; // Нахожу остаток минут в десятичном выражении и умножаю на 60 (т.к. 1 ч = 60 мин)
        int wholePartOfMinutes = (int) Math.floor(decimalMinutes); // Округляю здесь минуты в меньшую сторону до целого числа, чтобы выделить полное количество минут
        float decimalSecond = (decimalMinutes - wholePartOfMinutes) * 60; // Нахожу остаток секунд в десятичном выражении и умножаю на 60 (т.к. 1 м = 60 сек)
        int wholePartOfSecond = (int) Math.floor(decimalSecond); // Округляю здесь секунды в меньшую сторону до целого числа, чтобы выделить полное количество секунд
        System.out.println("Потребуется: " + wholePartOfDays + " дней, " + wholePartOfHours + " часов, " + wholePartOfMinutes + " минут, " + wholePartOfSecond + " секунд."); //Выводит в консоль строку вида: "Потребуется: 18 дней, 15 часов, 59 минут, 59 секунд."

        System.out.println(" ");
        System.out.println("Task8");
        int salaryMary = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryPerYearMary = salaryMary * 12;
        int salaryPerYearDenis = salaryDenis * 12;
        int salaryPerYearKristina = salaryKristina * 12;
        float increasedSalaryMary = salaryMary + (salaryMary * 0.1f);
        float increasedSalaryDenis = salaryDenis + (salaryDenis * 0.1f);
        float increasedSalaryKristina = salaryKristina + (salaryKristina * 0.1f);
        float newSalaryPerYearMary = increasedSalaryMary * 12;
        float newSalaryPerYearDenis = increasedSalaryDenis * 12;
        float newSalaryPerYearKristina = increasedSalaryKristina * 12;
        float differenceMary = newSalaryPerYearMary - salaryPerYearMary;
        float differenceDenis = newSalaryPerYearDenis - salaryPerYearDenis;
        float differenceKristina = newSalaryPerYearKristina - salaryPerYearKristina;
        System.out.println("Маша теперь получает " + increasedSalaryMary + " рублей. Годовой доход вырос на " + differenceMary + " рублей.");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
    }
}
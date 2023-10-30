public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1 ===");
            int varI = 254800;                  // Integer, 256^3 possible values. Default type.
            byte varB = 96;                     // Integer, 256 possible values.
            short varS = -4800;                 // Integer, 256^2 possible values.
            long varL = 9000500L;               // Integer, 256^4 possible values.
            float varF = 3.141592f;             // Standard Floating-point variable.
            double varD = 0.6180555555555555f;  // High-precision Floating-point variable.

            System.out.println("Значение переменной varI c типом int равно " + varI);
            System.out.println("Значение переменной varB c типом byte равно " + varB);
            System.out.println("Значение переменной varS c типом short равно " + varS);
            System.out.println("Значение переменной varL c типом long равно " + varL);
            System.out.println("Значение переменной varF c типом float равно " + varF);
            System.out.println("Значение переменной varD c типом double равно " + varD);

        System.out.println("=== Task 2 ===");
            float taskVar1 = 27.12f;            // Float, low precision.
            long taskVar2 = 987678965549L;      // Integer, exceeds int container size.
            float taskVar3 = 2.786f;            // Float, low precision.
            short taskVar4 = 569;               // Integer, exceeds byte container size.
            short taskVar5 = -159;              // Integer, exceeds byte container size.
            short taskVar6 = 27897;             // Integer, exceeds byte container size. Error risk when operated on, change to int if necessary.
            byte taskVar7 = 67;                 // Integer, low value. Error risk when operated on, change to short if necessary.
            System.out.println();               // No output requested.

        System.out.println("=== Task 3 ===");
            byte studentsClass1 = 23;
            byte studentsClass2 = 27;
            byte studentsClass3 = 30;
            short sheetsAmount = 420;
            short studentsTotal = (short) (studentsClass1 + studentsClass2 + studentsClass3);   //(short) added per automatic suggestion.
            short sheetsPerClass = (short) (sheetsAmount / studentsTotal);                      //(short) added per automatic suggestion.
            System.out.println("На каждого ученика рассчитано " + sheetsPerClass + " листов бумаги");

        System.out.println("=== Task 4 ===");
            byte prodSample = 16;                           // Known production rate sample per 2 minutes.
            byte prodRPM = (byte) (prodSample / 2);         // Base production rate per minute.
            byte prodPeriod1 = 20;                          // Production period of 20 minutes.
            short prodPeriod2 = 60 * 24;                    // Production period of 24-hour day in minutes.
            short prodPeriod3 = (short) (prodPeriod2 * 3);  // Production period of 3 full days in minutes.
            int prodPeriod4 = (prodPeriod2 * 30);           // Production period of a standard 30-day month.

            short prodCap1 = (short) (prodRPM * prodPeriod1);
            int prodCap2 = (prodRPM * prodPeriod2);
            int prodCap3 = (prodRPM * prodPeriod3);
            long prodCap4 = (prodRPM * prodPeriod4);

            System.out.println("За 20 минут машина произвела "+ prodCap1 +" штук бутылок");
            System.out.println("За сутки машина произвела "+ prodCap2 +" штук бутылок");
            System.out.println("За 3 дня машина произвела "+ prodCap3 +" штук бутылок");
            System.out.println("За месяц машина произвела "+ prodCap4 +" штук бутылок");

        System.out.println("=== Task 5 ===");
            byte paintCanTotal = 120;
            byte paintPerRoomWhite = 2;
            byte paintPerRoomBrown = 4;

            byte paintPerRoomTotal = (byte) (paintPerRoomWhite + paintPerRoomBrown);
            byte rooms = (byte) (paintCanTotal / paintPerRoomTotal);
            byte paintCanWhite = (byte) (paintPerRoomWhite * rooms);
            byte paintCanBrown = (byte) (paintPerRoomBrown * rooms);
            System.out.println("В школе, где "+ rooms +" классов, нужно "+ paintCanWhite + " белой краски и "+ paintCanBrown +" банок коричневой краски");

        System.out.println("=== Task 6 ===");
            byte bananaAmount = 5;
            byte bananaUnitWeight = 80;
            short milkVolumeTotal = 200;
            short milkPerGlassVolume = 100;
            short milkPerGlassWeight = 105;
            byte iceCreamAmount = 2;
            byte iceCreamUnitWeight = 100;
            byte eggWholeAmount = 4;
            byte eggWholeUnitWeight = 70;

            short mixWeightBanana = (short) (bananaAmount * bananaUnitWeight);
            short mixWeightMilk = (short) ((milkVolumeTotal / milkPerGlassVolume) * milkPerGlassWeight);
            short mixWeightIceCream = (short) (iceCreamAmount * iceCreamUnitWeight);
            short mixWeightEggWhole = (short) (eggWholeAmount * eggWholeUnitWeight);

            int mixWeightTotalG = mixWeightBanana + mixWeightMilk + mixWeightIceCream + mixWeightEggWhole;
            float mixWeightTotalK = (float) (mixWeightTotalG / 1000);
            System.out.println("Общий вес завтрака по рецепту составляет " + mixWeightTotalG + " грамм (" + mixWeightTotalK + " килограмм)");

        System.out.println("=== Task 7 ===");
            short weightLossRequired = 7000;
            short weightLossDailyMin = 250;
            short weightLossDailyMax = 500;

            short weightLossTermMin = (short) (weightLossRequired / weightLossDailyMin);
            short weightLossTermMax = (short) (weightLossRequired / weightLossDailyMax);
            short weightLossTermAvg = (short) ((weightLossTermMax + weightLossTermMin) / 2);
            System.out.println("Корректировка диеты позволит сбросить нужный вес в срок от " + weightLossTermMax + " до " + weightLossTermMin + " дней");
            System.out.println("Средний ожидаемый срок составит " + weightLossTermAvg + " дней");

        System.out.println("=== Task 8 ===");
            int salaryCurEmp1M = 67760;                                     // M = Monthly
            int salaryCurEmp2M = 83690;
            int salaryCurEmp3M = 76230;
            float salaryMultiplier = 1.1f;

            int salaryNewEmp1M = (int) (salaryCurEmp1M * salaryMultiplier); // Modified monthly salary
            int salaryNewEmp2M = (int) (salaryCurEmp2M * salaryMultiplier);
            int salaryNewEmp3M = (int) (salaryCurEmp3M * salaryMultiplier);

            int salaryDifEmp1A = (salaryNewEmp1M - salaryCurEmp1M) * 12;    // Annual salary difference
            int salaryDifEmp2A = (salaryNewEmp2M - salaryCurEmp2M) * 12;
            int salaryDifEmp3A = (salaryNewEmp3M - salaryCurEmp3M) * 12;

            System.out.println("Маша теперь получает " + salaryNewEmp1M + " рублей в месяц. Годовой доход вырос на " + salaryDifEmp1A + " рублей");
            System.out.println("Денис теперь получает " + salaryNewEmp2M + " рублей в месяц. Годовой доход вырос на " + salaryDifEmp2A + " рублей");
            System.out.println("Кристина теперь получает " + salaryNewEmp3M + " рублей в месяц. Годовой доход вырос на " + salaryDifEmp3A + " рублей");
    }
}
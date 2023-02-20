public class MonthsOfRestService {
    public int calcMonths(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int thresholdCount = 0; // количество денег на счету
        //income (доход от работы)
        // expense (обязательные месячные траты)
        for (int month = 0; month < 12; month++) {
            if (thresholdCount >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                thresholdCount = (thresholdCount - expense) / 3;
            } else {
                thresholdCount = thresholdCount + income - expense;
            }
        }
        return count;
    }
}


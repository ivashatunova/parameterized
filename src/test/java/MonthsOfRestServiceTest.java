import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsOfRestServiceTest {
    @Test
    void testFor3Months() {
        MonthsOfRestService service = new MonthsOfRestService();

        // подготавливаем данные:
        int income = 10_000;
        int expense = 3000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calcMonths(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFor2Months() {
        MonthsOfRestService service = new MonthsOfRestService();

        // подготавливаем данные:
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calcMonths(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}

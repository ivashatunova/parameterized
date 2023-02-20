import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsOfRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    void testFor3Months(int expected, int income, int expense, int threshold) {
        MonthsOfRestService service = new MonthsOfRestService();

        // вызываем целевой метод:
        int actual = service.calcMonths(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}

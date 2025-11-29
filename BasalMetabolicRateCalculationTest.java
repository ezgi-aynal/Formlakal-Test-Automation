import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BasalMetabolicRateCalculationTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/basal_metabolic_rate_calculation_woman.csv")
    void Basal_Metabolic_Rate_Calculation_Woman(int agirlik, int boy, int yas, int expected) {
        Assertions.assertEquals(expected, Basal_Metabolic_Rate.Basal_Metabolic_Rate_Calculation_Woman(agirlik, boy, yas));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/basal_metabolic_rate_calculation_man.csv")
    void Basal_Metabolic_Rate_Calculation_Man(int agirlik, int boy, int yas, int expected) {
        Assertions.assertEquals(expected, Basal_Metabolic_Rate.Basal_Metabolic_Rate_Calculation_Man(agirlik, boy, yas));
    }
}

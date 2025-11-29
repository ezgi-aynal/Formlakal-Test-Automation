import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BodyFatRatioCalculationTest {
    @ParameterizedTest
    @CsvSource({
            "80, 40, 170, 25, Ideal Yag Orani",
            "85, 42, 175, 30, Ideal Yag Orani",
            "90, 44, 180, 35, Ideal Yag Orani",
            "95, 46, 185, 40, Ideal Yag Orani",
            "100, 48, 190, 45, Ideal Yag Orani",
            "105, 50, 195, 50, Ideal Yag Orani",
            "110, 52, 200, 55, Ideal Yag Orani",
            "115, 54, 205, 60, Ideal Yag Orani",
            "120, 56, 210, 65, Ideal Yag Orani",
            "125, 58, 215, 70, Ideal Yag Orani"
    })
    public void Body_Fat_Ratio_Calculation_Test_Man(int bel, int boyun, int boy, int yas, String expected) {
        assertEquals(expected, Body_Fat_Ratio.Body_Fat_Ratio_Calculation_Man(bel, boyun, boy, yas));
    }

    @ParameterizedTest
    @CsvSource({
            "75, 90, 37, 165, 30, Ideal Yag Orani",
            "80, 95, 39, 170, 35, Ideal Yag Orani",
            "85, 100, 41, 175, 40, Ideal Yag Orani",
            "90, 105, 43, 180, 45, Ideal Yag Orani",
            "95, 110, 45, 185, 50, Ideal Yag Orani",
            "100, 115, 47, 190, 55, Ideal Yag Orani",
            "105, 120, 49, 195, 60, Ideal Yag Orani",
            "110, 125, 51, 200, 65, Ideal Yag Orani",
            "115, 130, 53, 205, 70, Ideal Yag Orani"
    })
    public void Body_Fat_Ratio_Calculation_Test_Woman(int bel, int kalca, int boyun, int boy, int yas, String expected) {
        assertEquals(expected, Body_Fat_Ratio.Body_Fat_Ratio_Calculation_Woman(bel, kalca, boyun, boy, yas));
    }
}

public class Basal_Metabolic_Rate {

    public static int Basal_Metabolic_Rate_Calculation_Woman(int agirlik, int boy, int yas) {
        return (int) (655.1 + (9.563 * agirlik) + (1.85 * boy) - (4.676 * yas));
    }

    public static int Basal_Metabolic_Rate_Calculation_Man(int agirlik, int boy, int yas) {
        return (int) (66.47 + (13.75 * agirlik) + (5.003 * boy) - (6.755 * yas));
    }
}

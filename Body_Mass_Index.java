public class Body_Mass_Index {

    public static String Body_Mass_Index_Calculation(int boy, int kilo){
        double bmi = kilo / Math.pow((boy / 100.0), 2);
        if (bmi < 18.49) {
            return "Ideal Kilonun Alti";
        }
        else if (bmi > 18.5 && bmi < 24.99) {
            return "Ideal Kilo";
        }
        else if (bmi > 25 && bmi < 29.99) {
            return "Ideal Kilonun Uzeri";
        }
        else {
            return "Ideal Kilonun Cok Uzeri";
        }
    }
}
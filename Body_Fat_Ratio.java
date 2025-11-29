import static java.lang.Math.log10;

public class Body_Fat_Ratio {

    public static String Body_Fat_Ratio_Calculation_Man(int bel, int boyun, int boy, int yas) {
        double islem = 495 / (1.0324 - 0.19077 * log10(bel - boyun) + 0.15456 * log10(boy)) - 450;
        if ((yas >= 18 && yas <= 20) && (islem >= 6.2 && islem <= 12.5)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 21 && yas <= 25) && (islem >= 7.3 && islem <= 13.6)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 26 && yas <= 30) && (islem >= 10.6 && islem <= 16.4)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 31 && yas <= 35) && (islem >= 11.7 && islem <= 17.5)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 36 && yas <= 40) && (islem >= 12.7 && islem <= 18.6)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 41 && yas <= 45) && (islem >= 15.9 && islem <= 21.3)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 46 && yas <= 50) && (islem >= 16.9 && islem <= 22.4)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 51 && yas <= 55) && (islem >= 18.0 && islem <= 23.4)) {
            return "Ideal Yag Orani";
        } else if (yas >= 56 && (islem >= 19.1 && islem <= 24.5)) {
            return "Ideal Yag Orani";
        }
        return "Ideal Yag Orani Degil";
    }

    public static String Body_Fat_Ratio_Calculation_Woman(int bel, int kalca, int boyun, int boy, int yas) {
        double islem = 495 / (1.29579 - 0.35004 * log10(bel + kalca - boyun) + 0.22100 * log10(boy)) - 450;

        if ((yas >= 18 && yas <= 20) && (islem >= 17.7 && islem <= 21.5)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 21 && yas <= 25) && (islem >= 20.3 && islem <= 23.8)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 26 && yas <= 30) && (islem >= 20.9 && islem <= 24.5)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 31 && yas <= 35) && (islem >= 21.5 && islem <= 25.1)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 36 && yas <= 40) && (islem >= 24.0 && islem <= 27.3)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 41 && yas <= 45) && (islem >= 24.6 && islem <= 27.9)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 46 && yas <= 50) && (islem >= 25.2 && islem <= 28.6)) {
            return "Ideal Yag Orani";
        } else if ((yas >= 51 && yas <= 55) && (islem >= 25.9 && islem <= 29.2)) {
            return "Ideal Yag Orani";
        } else if (yas >= 56 && (islem >= 26.5 && islem <= 29.8)) {
            return "Ideal Yag Orani";
        }
        return "Ideal Yag Orani Degil";
    }
}

public class DinoMassCalculator {
    
    static int KILOS_TO_GRAMS = 1000;
    static int TONS_TO_GRAMS = 1_000_000;
    
    // 1. Задача №1 - Динозавр - в килограмы
    public double calculatorDinoMassToKilos(double grams) {
        return grams / KILOS_TO_GRAMS;
    }

    // 1. Задача №1 - Динозавр - в тонны
    public double calculatorDinoMassToTons(double grams) {
        return grams / TONS_TO_GRAMS;
    }
}

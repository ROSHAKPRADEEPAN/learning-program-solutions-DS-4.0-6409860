package finance;

public class FinancialForecasting {
    public static double forecastValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;  
        double growthRate = 0.08;       
        int years = 5;

        double futureValue = forecastValue(presentValue, growthRate, years);
        System.out.printf("Predicted Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
